package vendingmachine.domain;

public class Product {
    public String name;
    public int price;
    public int count;

    public Product(String input) {
        input = input.substring(1,input.length()-1);
        String[] inputs = input.split(",");

        this.name = inputs[0];
        this.price = Integer.valueOf(inputs[1]);
        this.count = Integer.valueOf(inputs[2]);
    }
}
