package fr.java.spring.microservices.microserviceaccounts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.java.spring.microservices.microserviceaccounts.dao.AccountsRepository;
import fr.java.spring.microservices.microserviceaccounts.model.Accounts;

public class MicroserviceAccountsController {
    
    @Autowired AccountsRepository repository;

    @GetMapping(path = "/accounts")
    public Iterable<Accounts> getAllAccounts(){
        return this.repository.findAll();
    }

    @GetMapping(path = "accounts/id")
    public Optional<Accounts> getAccountSId(@RequestParam int id){
        return this.repository.findById(id);
    }

    @PostMapping(path = "/accounts")
    public String addAccount(@RequestParam float balance, @RequestParam int user_id, @RequestParam float rate){
        Accounts account = new Accounts(balance, user_id, rate);
        this.repository.save(account);
        return "An account has been created";
    }

    @PostMapping(path = "/accounts/delete")
    public String deleteAccount(@RequestParam int id){
        this.repository.deleteById(id);
        return "An account has been deleted";
    }
}
