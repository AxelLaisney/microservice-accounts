//Controller of the MicroserviceAccountApplication class
package fr.java.spring.microservices.microserviceaccounts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.java.spring.microservices.microserviceaccounts.dao.AccountsRepository;
import fr.java.spring.microservices.microserviceaccounts.model.Accounts;

//Annotation to define that our controller is a rest controller
@RestController
public class MicroserviceAccountsController {

    //Inject the UsersRepository class in the controller
    @Autowired AccountsRepository repository;

    /* 
    The annotations GetMapping and PostMapping define what to trigger based on the type of request received.
    the "path" determine what method to trigger based on the URI in the request.
    @ResquestParam is used to get the parameters in the get and post resquest.
    */

    //Return all accounts when a Get request is called with this URI
    @GetMapping(path = "/accounts")
    public Iterable<Accounts> getAllAccounts(){
        return this.repository.findAll();
    }

    //Return a specific account when an Id is given with this URI
    @GetMapping(path = "accounts/id")
    public Optional<Accounts> getAccountSId(@RequestParam int id){
        return this.repository.findById(id);
    }

    //Return a specific account based on a user id
    @GetMapping(path = "/accounts/user/")
    public Optional<Accounts> getAccountUserId(@RequestParam int id){
        return this.repository.getAccountByUserid(id);
    }

    //Add an user when a Post request is received
    @PostMapping(path = "/accounts")
    public String addAccount(@RequestParam float balance, @RequestParam int user_id, @RequestParam float rate){
        Accounts account = new Accounts(balance, user_id, rate);
        this.repository.save(account);
        return "An account has been created";
    }

    //Delete an user when a specific id is given
    @PostMapping(path = "/accounts/delete")
    public String deleteAccount(@RequestParam int id){
        this.repository.deleteById(id);
        return "An account has been deleted";
    }
}
