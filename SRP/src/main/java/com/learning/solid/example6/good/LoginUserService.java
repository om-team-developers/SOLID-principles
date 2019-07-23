package com.learning.solid.example6.good;

public class LoginUserService implements Login {
    /**
     * @param username
     * @param password
     * @return
     */
    public boolean loginUser(String username, String password) {
        return (username.equalsIgnoreCase("om") && password.equalsIgnoreCase("om"));
    }
}
