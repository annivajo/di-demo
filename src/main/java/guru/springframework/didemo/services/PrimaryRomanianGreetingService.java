package guru.springframework.didemo.services;


public class PrimaryRomanianGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryRomanianGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getRomanianGreeting();
    }
}
