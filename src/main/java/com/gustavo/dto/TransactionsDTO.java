package com.gustavo.dto;

public record TransactionsDTO(
    Long id,
    Float amount,
    String name,
    String type,
    String category ) {

    
}
