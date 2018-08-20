package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedContoller propertyInjectedContoller;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedContoller = new PropertyInjectedContoller();
        this.propertyInjectedContoller.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS,propertyInjectedContoller.sayHello());
    }
}
