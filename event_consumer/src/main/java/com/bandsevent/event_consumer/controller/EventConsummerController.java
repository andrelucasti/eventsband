package com.bandsevent.event_consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EventConsummerController {

    @RequestMapping("/home")
    public String home(){
        return "Hello Event Consumer";
    }
}
