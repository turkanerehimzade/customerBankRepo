package org.example.model;

import java.util.Scanner;

public class Customer {
    private  Long id = 0L;
    private String name;
    private String surname;
    private Cart cart;
    private Boolean isActive=true;

    public Customer() {

    }
    public Customer(Long id, String name, String surname, Cart cart) {
        this.id = id;
        this.name=name;
        this.surname=surname;
        this.cart=cart;
    }

    public Customer(String name, String surname, Cart b) {
        this.name=name;
        this.surname=surname;
        this.cart=b;
    }

    public  Long getID() {
        return this.id=id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public boolean getIsActive() {
            return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}


