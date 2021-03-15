package fr.java.spring.microservices.microserviceaccounts.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.java.spring.microservices.microserviceaccounts.model.Accounts;

//A generic Interface to magange CRUD operations.

public interface AccountsRepository  extends CrudRepository<Accounts, Integer>{
    

    //This method return an account based on the user_id
    //@Query is used to make a custom SQL querry
    @Query(value = "SELECT * FROM accounts WHERE user_id = :id")
    public Optional getAccountByUserid(@Param("id") int id);

    

}
