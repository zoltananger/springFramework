package hu.angerz.framework.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
public class GreetingService {
    @Autowired
    GreetingRepository greetingRepository;

    @Transactional
    public Greeting createGreeting(String name) {
        Greeting greeting = new Greeting();
        greeting.setContent("greeting " + name );
        greetingRepository.save(greeting);
        return greeting;
    }
}
