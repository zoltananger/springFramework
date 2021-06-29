package hu.angerz.framework.controllers;

import hu.angerz.framework.backend.Greeting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TestRestController {
    private static final Logger logger = LogManager.getRootLogger();

    @GetMapping(value = "/api/test")
    public String test() {
        return "hello world from rest";
    }

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/api/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
        logger.info("log from api/greeting: {}. {}", greeting.getId(), greeting.getContent());
        return greeting;
    }

}
