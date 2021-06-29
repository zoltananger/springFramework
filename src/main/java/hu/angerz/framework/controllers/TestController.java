package hu.angerz.framework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class TestController {

    private static final Logger logger = LogManager.getRootLogger();

    @GetMapping(value = "/")
    public String test() {

        logger.info("This is a test message - info");
        logger.debug("This is a test message - debug");
        logger.trace("This is a test message - trace");
        logger.error("This is a test message - error");

        return "index";

    }
}
