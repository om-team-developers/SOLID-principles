package com.learning.solid.example6.good;

public class SRPMain {
    public static void main(String[] args) {
        RegisterUserService registerUserService = new RegisterUserService();
        boolean register = registerUserService.registerUser("om", "om", "om@deerwalk.com");
        if (register) {
            System.out.println("Register Successful");
        }

        LoginUserService loginUserService = new LoginUserService();
        boolean login = loginUserService.loginUser("om", "om");
        if (login) {
            System.out.println("Login Successful");
        }

        SendEmailService sendEmailService = new SendEmailService();
        if (login && register) {
            System.out.println(sendEmailService.sendEmail("Email Send Successfully", "om@deerwalk.com"));
        }
    }
}
