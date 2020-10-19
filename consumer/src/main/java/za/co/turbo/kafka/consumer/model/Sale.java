package za.co.turbo.kafka.consumer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sale {

    private String itemName;
    private double price;
    private int qty;

    @Override
    public String toString() {
        return "Sale{" +
                "item='" + itemName + '\'' +
                ", price=" + price +
                ", quantity=" + qty +
                '}';
    }
}
