package com.bandsevent.event_producer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EventController {

    @GetMapping("/home")
    public String hello(){
        return "Hello Event Producer";
    }
}

