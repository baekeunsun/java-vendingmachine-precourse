package vendingmachine.domain;

import java.util.List;

public class Product {
    public String name;
    public int price;
    public int count;

    public Product(String input) {
        String[] inputs = input.split(",");
        this.name = inputs[0];
        this.price = Integer.valueOf(inputs[1]);
        this.count = Integer.valueOf(inputs[2]);
    }
}
