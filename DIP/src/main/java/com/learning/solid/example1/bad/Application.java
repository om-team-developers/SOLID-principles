
package main.java.com.learning.solid.example1.bad;

public class Application {

    private EmailService email = new EmailService();

    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.email.sendEmail(msg, rec);
    }
}
