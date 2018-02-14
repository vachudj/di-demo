package training.springframework.didemo.controllers;

import training.springframework.didemo.services.GreetingService;

public class ConstructorInjectedController {
    
    private GreetingService greetingService;

    ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    String sayHello() {
        return greetingService.sayGreeting();
    }
}
