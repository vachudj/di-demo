package training.springframework.didemo.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import training.springframework.didemo.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
    
    private ConstructorInjectedController constructorInjectedController;
    
    @Before
    public void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }
    
    @Test
    public void testGreeting() {
        Assert.assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }

}