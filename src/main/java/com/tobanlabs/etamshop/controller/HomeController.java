package com.tobanlabs.etamshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/home")
public class HomeController {

    @GetMapping
    public String getMessage(){
        return "Good Morning   Rachel!!";
    }
}
