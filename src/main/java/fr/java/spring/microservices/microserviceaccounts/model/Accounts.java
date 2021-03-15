package fr.java.spring.microservices.microserviceaccounts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

//Define a account model class based on the table account in the database
@Entity //define that we are describing a data base entity
@Data //lombok annotion to avoid to make all the setter and getter
public class Accounts {
    @Id //define that user_id is the primary key
    private int accounts_id;
    private float balance;
    private int user_id;
    private float rate;

    //Class controller to create an Account object
    public Accounts(float balance, int user_id, float rate){
        this.balance = balance;
        this.user_id = user_id;
        this.rate = rate;
    }
}
