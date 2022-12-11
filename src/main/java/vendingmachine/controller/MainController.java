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
            int cannotBuyPrice = 0;
            int cannotBuyCount = 0;
            for (Map.Entry<String, Product> product : products.entrySet()) {
                if (product.getValue().price > inputAmount) {
                    cannotBuyPrice += 1;
                }
                if (product.getValue().count == 0) {
                    cannotBuyCount += 1;
                }
            }
            if (cannotBuyPrice == products.size() || cannotBuyCount == products.size()) { // 살 수 있는 제품이 없을때
                break;
            }

            Product nowPurchaseProduct =  products.get(InputView.getPurchaseProduct());

            if (nowPurchaseProduct.price <= inputAmount) { // 구매
                nowPurchaseProduct.count -= 1;
                inputAmount -= nowPurchaseProduct.price;
            }
        }


    }
}
