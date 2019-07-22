package com.learning.solid.example4.good;
import com.learning.solid.example4.good.Person;

import java.util.Scanner;

public class PersonDataCapture {
    public static Person capturePersonData() {
        Scanner reader = new Scanner(System.in);

        Person person = new Person();
        Person user = new Person();

        System.out.println("What is your firstName ???");                                    // ROC if we want to change how we want to take user input the class has to change
        user.firstName = reader.nextLine();

        System.out.println("What is your lastName ???");
        user.lastName = reader.nextLine();

        reader.close();
        return user;
    }
}
