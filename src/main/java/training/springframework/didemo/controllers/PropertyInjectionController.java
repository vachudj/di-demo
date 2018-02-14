package training.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import training.springframework.didemo.services.GreetingService;

@Controller
public class PropertyInjectionController {
    
    @Autowired
    public GreetingService greetingService;
    
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
