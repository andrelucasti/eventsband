package com.bandsevent.event_producer.controller;


import com.bandsevent.event_producer.model.Event;
import com.bandsevent.event_producer.service.EventConsumerServiceClient;
import com.bandsevent.event_producer.service.EventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/")
public class EventController {

    @Autowired
    private EventProducer eventProducer;

    @Autowired
    private EventConsumerServiceClient eventConsumerServiceClient;

    @GetMapping("/home")
    public String hello(){
        return "Hello Event Producer";
    }

    @GetMapping("/consumer/home")
    public String consumerHome(){
        return eventConsumerServiceClient.home();
    }

    @PostMapping("/publish")
    public void saveEvent(@RequestBody  Event event){

        eventProducer.sendEvent(event);


    }
}

