package mmh.DesignPatternsJava.creational.Factory.service;

import mmh.DesignPatternsJava.creational.Factory.interfaces.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageServiceFactory {

      private final EmailService emailService;
      private final SmsService smsService;

      @Autowired
      public MessageServiceFactory(EmailService emailService, SmsService smsService) {
            this.emailService = emailService;
            this.smsService = smsService;
      }

      public MessageService getMessageService(String type) {
            return switch (type.toLowerCase()) {
                  case "email" -> emailService;
                  case "sms" -> smsService;
                  default -> throw new IllegalArgumentException("Unknown service type: " + type);
            };
      }
}

