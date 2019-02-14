package com.bandsevent.event_producer.service;

import com.bandsevent.event_producer.model.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EventProducer {

    private static final Logger logger = LoggerFactory.getLogger(EventProducer.class);
    private static final String TOPIC = "event";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendEvent(Event event){

        this.kafkaTemplate.send(TOPIC, event.toString());

    }
}
