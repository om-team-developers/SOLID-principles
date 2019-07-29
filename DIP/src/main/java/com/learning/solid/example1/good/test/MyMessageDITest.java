
package main.java.com.learning.solid.example1.good.test;

import main.java.com.learning.solid.example1.good.consumer.Consumer;
import main.java.com.learning.solid.example1.good.injector.MessageServiceInjector;
import main.java.com.learning.solid.example1.good.injector.EmailServiceInjector;
import main.java.com.learning.solid.example1.good.injector.SMSServiceInjector;

public class MyMessageDITest {

    public static void main(String[] args) {
        String msg = "Hi User";
        String email = "ankshrestha@abc.com";
        String phone = "4088888888";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }

}
