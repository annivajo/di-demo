package guru.springframework.didemo.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("ro")
public class PrimaryRomanianGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "buna ziua";
    }
}
