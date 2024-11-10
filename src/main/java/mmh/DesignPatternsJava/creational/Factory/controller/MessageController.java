package mmh.DesignPatternsJava.creational.Factory.controller;

import mmh.DesignPatternsJava.creational.Factory.interfaces.MessageService;
import mmh.DesignPatternsJava.creational.Factory.service.MessageServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

      private final MessageServiceFactory messageServiceFactory;

      @Autowired
      public MessageController(MessageServiceFactory messageServiceFactory) {
            this.messageServiceFactory = messageServiceFactory;
      }

      @GetMapping("/send")
      public String sendMessage(@RequestParam String type, @RequestParam String message) {
            MessageService service = messageServiceFactory.getMessageService(type);
            service.sendMessage(message);
            return "Message sent via " + type;
      }
}
