package vendingmachine.controller;


import vendingmachine.domain.Product;
import vendingmachine.service.CoinSetting;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

import java.util.ArrayList;
import java.util.List;


public class MainController {
    public MainController() {
        int vendingmachineAmount = InputView.getVendingmachineAmount();
        OutputView.printVendingmachineAmount(new CoinSetting(vendingmachineAmount).vendingmachineCoins);
        List<Product> products = new ArrayList<>();
        for (String product : InputView.getProduct()) {
            products.add(new Product(product));
        }
        int inputAmount = InputView.getInputAmount();

        while (true) {
            OutputView.printInputAmount(inputAmount);
            String nowPurchaseProduct = InputView.getPurchaseProduct();


        }


    }
}
