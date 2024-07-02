package com.wayerz.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "wayerz", groupId = "groupId")
    void listener(String data) {
        System.out.println("LISTENER RECEIVED: " + data);
    }
}
