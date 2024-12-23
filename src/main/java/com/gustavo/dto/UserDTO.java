package com.gustavo.dto;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record UserDTO(  
    
@JsonProperty("_id") long id,
    
@NotBlank @NotNull @Length(min = 5, max = 100) String name,
@NotNull @Length(max = 10) @Pattern(regexp = "despesa") String category) {

}
