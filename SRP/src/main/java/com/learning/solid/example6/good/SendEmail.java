package com.learning.solid.example6.good;

public interface SendEmail {
    /**
     * @param emailBody
     * @param emailTo
     * @return
     */
    String sendEmail(String emailBody, String emailTo);
}
