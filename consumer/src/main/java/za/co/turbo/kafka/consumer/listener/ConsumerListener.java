package za.co.turbo.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import za.co.turbo.kafka.consumer.model.Sale;

@Service
public class ConsumerListener {

    @KafkaListener(topics = "example-topic-text", containerFactory = "kafkaStringListenerContainerFactory")
    public void consume(String message) {
        System.out.println(">>>>>>>>>>>>>>> TEXT >>>>>>>>>>>>>>>");
        System.out.println(message);
        System.out.println("<<<<<<<<<<<<<<< TEXT <<<<<<<<<<<<<<<");
    }

    @KafkaListener(topics = "example-topic", containerFactory = "kafkaListenerContainerFactory")
    public void consumeJson(Sale sale) {
        System.out.println(">>>>>>>>>>>>>>>> JSON >>>>>>>>>>>>>>>>");
        System.out.println(sale);
        System.out.println("<<<<<<<<<<<<<<<< JSON <<<<<<<<<<<<<<<<");
    }
}
