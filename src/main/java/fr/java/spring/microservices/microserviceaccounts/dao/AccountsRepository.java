package fr.java.spring.microservices.microserviceaccounts.dao;

import org.springframework.data.repository.CrudRepository;

import fr.java.spring.microservices.microserviceaccounts.model.Accounts;

public interface AccountsRepository  extends CrudRepository<Accounts, Integer>{
    
}
