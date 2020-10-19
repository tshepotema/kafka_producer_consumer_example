package za.co.turbo.kafka.producer.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sale {

    private String itemName;
    private double price;
    private int quantity;

    public Sale(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
