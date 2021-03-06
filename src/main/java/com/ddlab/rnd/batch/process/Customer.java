package com.ddlab.rnd.batch.process;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {

	@Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    
    public Customer() {}
    
    public Customer(String firstName, String lastName) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    }
}
