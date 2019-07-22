package com.learning.solid.example6.wrong;

public interface User {
    /**
     * @param username
     * @param password
     * @return
     */
    boolean Login(String username, String password);

    /**
     * @param username
     * @param password
     * @param email
     * @return
     */
    boolean Register(String username, String password, String email);


    /**
     * @param emailBody
     * @param emailTo
     * @return
     */
    String sendEmail(String emailBody, String emailTo);
}

