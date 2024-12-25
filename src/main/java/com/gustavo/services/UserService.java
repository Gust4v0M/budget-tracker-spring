package com.gustavo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;


import com.gustavo.dto.UserDTO;
import com.gustavo.dto.mapper.UserMapper;
import com.gustavo.repository.UsersRepository;


@Validated
@Service
public class UserService {

    private final UsersRepository usersRepository;
    private final UserMapper userMapper;
    

    public UserService(UsersRepository usersRepository, UserMapper userMapper){
        this.usersRepository = usersRepository;
        this.userMapper = userMapper;
    }

    public List<UserDTO> list(){
        return usersRepository.findAll()
    .stream()
    .map(userMapper :: toDTO)
        .collect(Collectors.toList());
    }

    //por enquanto não faz sentido ter metodos como update e find by id e create, pelo menos para os users
    
}
