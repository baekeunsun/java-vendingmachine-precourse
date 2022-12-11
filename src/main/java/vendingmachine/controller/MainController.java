package vendingmachine.controller;


import vendingmachine.domain.Product;
import vendingmachine.service.CoinSetting;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainController {
    public MainController() {
        int vendingmachineAmount = InputView.getVendingmachineAmount();
        OutputView.printVendingmachineAmount(new CoinSetting(vendingmachineAmount).vendingmachineCoins);
        Map<String,Product> products = new HashMap<>();
        for (String product : InputView.getProduct()) {
            Product tmpProduct = new Product(product);
            products.put(tmpProduct.name, tmpProduct);
        }
        int inputAmount = InputView.getInputAmount();

        while (true) {
            OutputView.printInputAmount(inputAmount);
            Product nowPurchaseProduct =  products.get(InputView.getPurchaseProduct());

            if (nowPurchaseProduct.price <= inputAmount) { // 구매
                nowPurchaseProduct.count -= 1;
                inputAmount -= nowPurchaseProduct.price;
            }


        }


    }
}
