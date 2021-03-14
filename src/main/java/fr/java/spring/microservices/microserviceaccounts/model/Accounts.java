package fr.java.spring.microservices.microserviceaccounts.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Accounts {
    @Id
    private int accounts_id;
    private float balance;
    private int user_id;
    private float rate;


    public Accounts(float balance, int user_id, float rate){
        this.balance = balance;
        this.user_id = user_id;
        this.rate = rate;
    }
}
