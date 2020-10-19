package za.co.turbo.kafka.producer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.turbo.kafka.producer.model.Sale;

@RestController
@RequestMapping("kafka")
public class SaleController {

    @Autowired
    private KafkaTemplate<String, Sale> kafkaTemplate;

    private static final String TOPIC = "example-topic";

    @GetMapping("/publish/{item}/{price}/{qty}")
    public String post(@PathVariable("item") final String item, @PathVariable("price") final double price, @PathVariable("qty") final int qty) {

        kafkaTemplate.send(TOPIC, new Sale(item, price, qty));

        return "Published successfully " + item + " :: R" + price + " x " + qty;
    }
}
