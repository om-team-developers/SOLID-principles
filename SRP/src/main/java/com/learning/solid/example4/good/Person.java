package com.learning.solid.example4.good;

import com.google.common.base.Strings;

public class Person {
    String firstName;
    String lastName;
    String userName;

    public void save(){
        System.out.println("Saving...");
        System.out.println(this.firstName + " "+ this.lastName + " saved.");
    }
}
