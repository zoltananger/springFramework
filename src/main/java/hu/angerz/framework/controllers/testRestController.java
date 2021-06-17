package hu.angerz.framework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testRestController {

    @GetMapping(value = "/api/test")
    public String test() {
        return "hello world from rest";
    }
}
