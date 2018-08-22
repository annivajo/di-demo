package guru.springframework.didemo.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang){

        switch (lang){
            case "en": return new PrimaryGreetingService(greetingRepository);

            case "it": return new PrimaryItalianGreetingService(greetingRepository);

            case "ro": return new PrimaryRomanianGreetingService(greetingRepository);

            default: return new PrimaryGreetingService(greetingRepository);
        }

    }


}
