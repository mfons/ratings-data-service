package io.javabrains.ratings_data_service.consumer;

import io.javabrains.movie_info_service.models.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = "messages", groupId = "message_group_id")
    public void consume(Message movie) {
        System.out.println("Consuming the message: " + movie);
    }
}
