
package main.java.com.learning.solid.example1.good.injector;

import main.java.com.learning.solid.example1.good.consumer.Consumer;

public interface MessageServiceInjector {

    public Consumer getConsumer();
}
