package training.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

import training.springframework.didemo.services.GreetingService;

@Controller
public class MyController {
    
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!!!");
        return greetingService.sayGreeting();
    }
}
