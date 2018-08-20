package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements  GreetingService{
    @Override
    public String sayGreetings() {
        return "constructor greeting service impl";
    }
}
