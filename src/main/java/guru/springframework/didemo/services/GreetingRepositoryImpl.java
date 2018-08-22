package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getItalianGreeting() {
        return "Ciao - servicio";
    }

    @Override
    public String getRomanianGreeting() {
        return "Buna ziua - serviciu";
    }

}
