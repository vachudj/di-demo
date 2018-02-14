package training.springframework.didemo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import training.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectionControllerTest {

    private PropertyInjectionController propertyInjectionController;
    
    @Before
    public void setUp() {
        this.propertyInjectionController = new PropertyInjectionController();
        this.propertyInjectionController.greetingService = new GreetingServiceImpl();
    }
    
    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectionController.sayHello());
    }
}