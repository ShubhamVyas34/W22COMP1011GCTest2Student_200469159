package com.example.w22comp1011gctest2student;

import java.util.ArrayList;

public class Customer {
    public int id;
    public String firstName;
    public String lastName;
    public String phoneNumber;
    private ArrayList<String> purchases;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<String> getPurchases() {
        return purchases;
    }

}