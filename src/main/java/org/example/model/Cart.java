package org.example.model;

import java.util.Scanner;

public class Cart {
    private String cartNumber;
    private String expiryDate;
    private String cvv;
    public String status="unblock";

    public Cart() {
    }

    public Cart(String cartNumber,String expiryDate,String cvv) {
        this.cartNumber = cartNumber;
        this.expiryDate=expiryDate;
        this.cvv=cvv;
    }

    public String getCartNumber() {
        return cartNumber;

    }

    public void setCartNumber(String cartNumber) {
        this.cartNumber = cartNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

}
