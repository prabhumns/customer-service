package com.prabhu.customerservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @project customer-service
 * @authoer Prabhu Madipalli
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {


    @Column(name = "username")
    private String username;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "password")
    private String Password;

    @Column(name = "customer_name")
    private String name;

    public Customer(String username, String password, String name, int accountBalance) {
        this.accountBalance = accountBalance;
        this.username = username;
        this.Password = password;
        this.name = name;
    }

    @Column(name = "account_balance")
    private int accountBalance;


}
