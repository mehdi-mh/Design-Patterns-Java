package mmh.DesignPatternsJava.creational.Factory.service;

import mmh.DesignPatternsJava.creational.Factory.interfaces.MessageService;
import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {
      @Override
      public void sendMessage(String message) {
            System.out.println("Sending Email: " + message);
      }
}
