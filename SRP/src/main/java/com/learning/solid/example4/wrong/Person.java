package com.learning.solid.example4.wrong;

public class Person {
    String firstName;
    String lastName;
    String userName;

    public void save() {
        System.out.println("Saving...");
        System.out.println(this.firstName + " " + this.lastName + " saved.");
    }
}
