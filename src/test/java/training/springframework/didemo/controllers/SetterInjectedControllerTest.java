package training.springframework.didemo.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import training.springframework.didemo.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
    
    private SetterInjectedController setterInjectedController;
    
    @Before
    public void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }
    
    @Test
    public void testGreeting() {
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }
}