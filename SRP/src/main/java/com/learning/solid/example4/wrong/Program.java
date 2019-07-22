package com.learning.solid.example4.wrong;

import com.google.common.base.Strings;
import com.learning.solid.example4.wrong.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        //Creating user model
        Person user = new Person();

        System.out.println("What is your firstName ???");                                    // ROC if we want to change how we want to take user input the class has to change
        user.firstName = reader.nextLine();

        System.out.println("What is your lastName ???");
        user.lastName = reader.nextLine();

        if (Strings.isNullOrEmpty(user.firstName)){                                         // If user validation has to change the class has to change
            System.out.println("Empty First Name found. Please enter a valid first name.");
            System.exit(0);
        }

        if (Strings.isNullOrEmpty(user.lastName)){
            System.out.println("Empty Last Name found. Please enter a valid first name.");
            System.exit(0);
        }
        //setting username
        user.userName = user.firstName.substring(0,1)+user.lastName;
        //Saving user
        System.out.println("Your username is : " + user.userName);
        user.save();

        reader.close();
    }
}
