package mmh.DesignPatternsJava.creational.Singleton.controller;

import mmh.DesignPatternsJava.creational.Singleton.service.SingletonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingletonController {

      private final SingletonService singletonService;

      @Autowired
      public SingletonController(SingletonService singletonService) {
            this.singletonService = singletonService;
      }

      @GetMapping("/message")
      public String showMessage() {
            singletonService.showMessage();  // Output: Hello from SingletonService!
            return "Message displayed in console";
      }
}