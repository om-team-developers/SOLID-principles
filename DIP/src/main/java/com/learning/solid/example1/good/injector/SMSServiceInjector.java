
package main.java.com.learning.solid.example1.good.injector;

import main.java.com.learning.solid.example1.good.consumer.Consumer;
import main.java.com.learning.solid.example1.good.consumer.MyDIApplication;
import main.java.com.learning.solid.example1.good.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }

}
