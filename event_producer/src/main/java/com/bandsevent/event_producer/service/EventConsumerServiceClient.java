package com.bandsevent.event_producer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "event-consumer-service")
public interface EventConsumerServiceClient {

    @GetMapping("/home")
    String home();
}
