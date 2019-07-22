package com.learning.solid.example6.good;

public class SendEmailService implements SendEmail {
    /**
     * @param emailBody
     * @param emailTo
     * @return
     */
    public String sendEmail(String emailBody, String emailTo) {
        return emailBody + " to " + emailTo;
    }
}
