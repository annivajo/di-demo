package guru.springframework.didemo.config;

import guru.springframework.didemo.services.GreetingRepository;
import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService primaryGreetingService(GreetingServiceFactory factory){
        return factory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("it")
    GreetingService primaryItalianGreetingService(GreetingServiceFactory factory){
        return factory.createGreetingService("it");
    }

    @Bean
    @Primary
    @Profile("ro")
    GreetingService primaryRomanianGreetingService(GreetingServiceFactory factory){
        return factory.createGreetingService("ro");
    }


}
