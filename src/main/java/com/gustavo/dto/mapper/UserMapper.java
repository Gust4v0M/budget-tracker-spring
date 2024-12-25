package com.gustavo.dto.mapper;

import org.springframework.stereotype.Component;

import com.gustavo.dto.UserDTO;
import com.gustavo.models.Users;

@Component
public class UserMapper {
    public UserDTO toDTO(Users user){
        if(user == null){
            return null;
        }
        return new UserDTO(user.getId(), user.getName(), user.getBalance());
    }
    public Users toEntity(UserDTO userDTO){

        if(userDTO == null){
            return null;
        }
        Users users = new Users();
        if(userDTO.id() != null){
            users.setId(userDTO.id());
        }
        users.setName(userDTO.name());
        users.setBalance(userDTO.balance());

        return users;
    }
}
