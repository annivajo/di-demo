package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static String HELLO_GURUS = "Hello gurus!!!";

    @Override
    public String sayGreetings() {
        return  HELLO_GURUS;
    }
}
