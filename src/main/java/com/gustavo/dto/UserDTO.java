package com.gustavo.dto;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserDTO(  
    
@JsonProperty("_id") Long id,
    
@NotBlank @NotNull @Length(min = 5, max = 100) String name,
@NotNull @Length(max = 10) Float balance, List<TransactionsDTO> transactions) {

}
