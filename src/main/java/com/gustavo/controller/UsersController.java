package com.gustavo.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.dto.UserDTO;
import com.gustavo.models.Users;
import com.gustavo.repository.UsersRepository;
import com.gustavo.services.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/user")
@AllArgsConstructor
public class UsersController{
  

  private final UsersRepository usersRepository;
  private final UserService userService;

  @GetMapping
  public List<UserDTO> list(){
    return userService.list();
  }
  

  @PostMapping()
  @ResponseStatus(code = HttpStatus.CREATED)
    public Users create(@RequestBody Users users){
      return usersRepository.save(users);
    }


}
