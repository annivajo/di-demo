package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Setter Greeting Service Impl";
    }
}
