
package main.java.com.learning.solid.example1.good.injector;

import main.java.com.learning.solid.example1.good.consumer.Consumer;
import main.java.com.learning.solid.example1.good.consumer.MyDIApplication;
import main.java.com.learning.solid.example1.good.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new EmailServiceImpl());
    }

}
