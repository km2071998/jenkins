package com.dx.republic.testjenkines.rest.v1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WelcomeResource {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String welcomeMessage(){
        return "welcome in our app...";
    }
}
