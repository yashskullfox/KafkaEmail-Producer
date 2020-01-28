package com.kafka.Engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Producer {
    private static final String TOPIC = "EmailModel";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void SendMessage (String message){
        this.kafkaTemplate.send(TOPIC, message);
    }
}
