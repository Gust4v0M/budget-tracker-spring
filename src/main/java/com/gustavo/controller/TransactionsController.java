package com.gustavo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.models.Transactions;
import com.gustavo.repository.TransactionsRepository;
import org.springframework.web.bind.annotation.GetMapping;



@RestController


public class TransactionsController {

    TransactionsRepository transactionsRepository;

    @GetMapping
    public List<Transactions>list() {
        return transactionsRepository.findAll();
    }
    
    
    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public Transactions create(@RequestBody Transactions transactions){
        return transactionsRepository.save(transactions);
    }
}
