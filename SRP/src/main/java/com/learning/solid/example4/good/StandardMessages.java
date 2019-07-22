package com.learning.solid.example4.good;

public class StandardMessages {

    public static void getWelcomeMessage(){
        System.out.println("Welcome to the single responsibility wrong implementation");
    }

    public static void endApplicationMessage(String userName){
        System.out.println("User " + userName + " has been saved.");
    }
}
