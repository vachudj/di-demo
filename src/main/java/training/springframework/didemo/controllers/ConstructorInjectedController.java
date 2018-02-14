package training.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import training.springframework.didemo.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    
    private GreetingService greetingService;

    @Autowired //Not needed here but it's still good practice.
    ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
