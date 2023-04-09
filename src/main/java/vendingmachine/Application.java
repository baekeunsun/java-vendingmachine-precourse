package vendingmachine;

import vendingmachine.controller.MainController;
import vendingmachine.view.OutputView;

public class Application {
    public static void main(String[] args) {
        try {
            new MainController();
        } catch (IllegalArgumentException e) {
            OutputView.printError(e.getMessage());
        }
    }
}
