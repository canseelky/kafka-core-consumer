package com.kafka.kafkacoreconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {


    @KafkaListener(topics = "t-hello")
    public void consumeMessage(String message){
        System.out.println("message-->"+message);
    }

}
