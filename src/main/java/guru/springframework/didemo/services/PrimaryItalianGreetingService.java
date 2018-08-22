package guru.springframework.didemo.services;


public class PrimaryItalianGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryItalianGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getItalianGreeting();
    }
}
