package vendingmachine;

import vendingmachine.controller.MainController;

public class Application {
    public static void main(String[] args) {
        while (true) {
            try {
                new MainController();
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
