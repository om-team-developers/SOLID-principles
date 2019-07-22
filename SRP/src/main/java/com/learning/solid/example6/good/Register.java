package com.learning.solid.example6.good;

public interface Register {
    /**
     * @param username
     * @param password
     * @param email
     * @return
     */
    boolean registerUser(String username, String password, String email);
}
