package com.learning.solid.example6.wrong;

public class SRPMain {
    /**
     * @param args
     */
    public static void main(String[] args) {
        UserService userService = new UserService();
        boolean register = userService.Register("om", "om", "om@deerwalk.com");
        boolean login = userService.Login("om", "om");

        if (register) {
            System.out.println("Register Successful");
        }

        if (login) {
            System.out.println("Login Successful");
        }

        if (login && register) {
            System.out.println(userService.sendEmail("Email Send Successfully", "om@deerwalk.com"));
        }
    }
}
