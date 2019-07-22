package com.learning.solid.example6.good;

public class RegisterUserService implements Register {
    /**
     * @param username
     * @param password
     * @param email
     * @return
     */
    public boolean registerUser(String username, String password, String email) {
        return (username.equalsIgnoreCase("om") && password.equalsIgnoreCase("om") && email.equalsIgnoreCase("om@deerwalk.com"));
    }
}
