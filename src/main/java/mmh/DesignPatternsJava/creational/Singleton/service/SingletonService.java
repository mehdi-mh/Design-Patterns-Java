package mmh.DesignPatternsJava.creational.Singleton.service;

import org.springframework.stereotype.Service;

@Service
public class SingletonService {
      public void showMessage() {
            System.out.println("Hello from SingletonService!");
      }
}
