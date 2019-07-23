package com.learning.solid.example6.wrong;

/**
 *
 */
public class UserService implements User {
    /**
     * @param username
     * @param password
     * @return
     */
   public boolean Login(String username, String password) {
       return (username.equalsIgnoreCase("om") && password.equalsIgnoreCase("om"));
   };


    /**
     * @param username
     * @param password
     * @param email
     * @return
     */
    public boolean Register(String username, String password, String email) {
        return (username.equalsIgnoreCase("om") && password.equalsIgnoreCase("om") && email.equalsIgnoreCase("om@deerwalk.com"));
    };


    /**
     * @param emailBody
     * @param emailTo
     * @return
     */
    public String sendEmail(String emailBody, String emailTo) {
        return emailBody + " to " + emailTo;
    };
}
