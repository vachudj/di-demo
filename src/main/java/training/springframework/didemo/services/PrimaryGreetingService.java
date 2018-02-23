package training.springframework.didemo.services;

//@Service
//@Primary
//@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting service";
    }
}
