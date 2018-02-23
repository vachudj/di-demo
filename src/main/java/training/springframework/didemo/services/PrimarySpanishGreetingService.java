package training.springframework.didemo.services;

//@Service
//@Profile("es")
//@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}
