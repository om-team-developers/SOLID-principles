
package main.java.com.learning.solid.example1.bad;

public class EmailService {

    public void sendEmail(String message, String receiver){
        //logic to send email
        System.out.println("Email sent to "+receiver+ " with Message="+message);
    }
}
