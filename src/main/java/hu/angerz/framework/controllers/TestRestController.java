package hu.angerz.framework.controllers;

import hu.angerz.framework.backend.Greeting;
import hu.angerz.framework.backend.GreetingService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestRestController {
    private static final Logger logger = LogManager.getRootLogger();

    @Autowired
    GreetingService greetingService;

    @GetMapping(value = "/api/test")
    public String test() {
        return "hello world from rest";
    }


    @GetMapping(value = "/api/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

        Greeting greeting = greetingService.createGreeting(name);
        logger.info("log from api/greeting: {}. {}", greeting.getId(), greeting.getContent());
        return greeting;
    }
}
