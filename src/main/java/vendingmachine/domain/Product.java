package vendingmachine.domain;

import java.util.List;

public class Product {
    String name;
    int price;
    int count;

    public Product(String input) {
        String[] inputs = input.split(",");
        this.name = inputs[0];
        this.price = Integer.valueOf(inputs[1]);
        this.count = Integer.valueOf(inputs[2]);
    }
}
