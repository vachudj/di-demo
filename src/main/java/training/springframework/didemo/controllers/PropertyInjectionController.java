package training.springframework.didemo.controllers;

import training.springframework.didemo.services.GreetingService;

public class PropertyInjectionController {
    
    public GreetingService greetingService;
    
    String sayHello() {
        return greetingService.sayGreeting();
    }
}
