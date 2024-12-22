package com.gustavo.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Users {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(length = 100, nullable = false)
  private String name;

  @Column(length = 15, nullable=false)
  private Float balance;

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "userTransactionId")
     @JsonManagedReference
  private List<Transactions> userTransactionId = new ArrayList<>();
}
 