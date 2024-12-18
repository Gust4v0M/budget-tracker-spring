package com.gustavo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.models.Transactions;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Long>{
    
}
