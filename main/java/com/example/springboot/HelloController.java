package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController combines @Controller and @ResponseBody, returning data rather than a view
@RestController // this class is marked this way to signify that it is ready for use by Spring MVC to handle web requests
public class HelloController {

    @GetMapping("/") // maps '/' to the index() method
    public String index() { // this method returns pure text
        return "Greetings from Spring Boot!";
    }
}
