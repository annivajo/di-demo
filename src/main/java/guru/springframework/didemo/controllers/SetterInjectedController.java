package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingServiceImpl;

    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    public void setGreetingServiceImpl(GreetingService greetingServiceImpl) {
        this.greetingServiceImpl = greetingServiceImpl;
    }

    public String sayHello() {
        return greetingServiceImpl.sayGreetings();
    }
}
