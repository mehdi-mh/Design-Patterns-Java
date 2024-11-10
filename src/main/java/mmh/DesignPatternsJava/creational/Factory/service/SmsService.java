package mmh.DesignPatternsJava.creational.Factory.service;

import mmh.DesignPatternsJava.creational.Factory.interfaces.MessageService;
import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService {
      @Override
      public void sendMessage(String message) {
            System.out.println("Sending SMS: " + message);
      }
}
