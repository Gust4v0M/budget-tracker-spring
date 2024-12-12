package com.gustavo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Users {

  @Id 
  private Integer id;

  @Column(length = 100, nullable = false)
  private String name;

  @Column(length = 15, nullable=false)
  private Float balance;


}
