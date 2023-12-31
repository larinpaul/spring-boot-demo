package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello World!";
        // http://localhost:8080/hello // 8181 after server.port=8181, or it can be in application.yml, server: port:8282
    }

}
