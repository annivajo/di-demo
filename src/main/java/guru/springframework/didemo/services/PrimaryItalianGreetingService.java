package guru.springframework.didemo.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("it")
@Primary
public class PrimaryItalianGreetingService implements GreetingService{


    @Override
    public String sayGreetings() {
        return "ciao";
    }
}
