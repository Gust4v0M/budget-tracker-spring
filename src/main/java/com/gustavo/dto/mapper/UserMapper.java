package com.gustavo.dto.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.gustavo.dto.UserDTO;
import com.gustavo.dto.TransactionsDTO;
import com.gustavo.models.Users;


@Component
public class UserMapper {
    public UserDTO toDTO(Users user){
        if(user == null){
            return null;
        }
        List<TransactionsDTO>transactionIds = user.getTransactionId()
        .stream()
        .map(transactionId -> new TransactionsDTO(transactionId.getId(),  transactionId.getAmount(), transactionId.getName(), transactionId.getType(),
        transactionId.getCategory()))
        .collect(Collectors.toList());
        return new UserDTO(user.getId(), user.getName(), user.getBalance(), transactionIds);
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
