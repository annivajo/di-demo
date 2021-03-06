package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// VERY BAD

@Controller
public class PropertyInjectedContoller {

    @Autowired //property name matches bean name if there is no @Primary
    //if there is a @Primary then @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello() {
       return greetingServiceImpl.sayGreetings();
    }
}
