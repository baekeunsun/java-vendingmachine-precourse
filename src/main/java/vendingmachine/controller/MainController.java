package vendingmachine.controller;


import vendingmachine.domain.Product;
import vendingmachine.service.CoinSetting;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

import java.util.*;


public class MainController {
    public MainController() {
        int vendingmachineAmount = InputView.getVendingmachineAmount();
        CoinSetting vendingmachine = new CoinSetting(vendingmachineAmount);
        OutputView.printVendingmachineAmount(vendingmachine.vendingmachineCoins);

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
        List<Integer> change = Arrays.asList(0,0,0,0);


        List<Integer> Coins = Arrays.asList(500,100,50,10);
        for (int c = 0; c <4; c++) {
            while ((inputAmount >= Coins.get(c)) && (vendingmachine.vendingmachineCoins.get(c) > 0)) {
                inputAmount -= Coins.get(c);
                vendingmachine.vendingmachineCoins.set(c,vendingmachine.vendingmachineCoins.get(c)-1);
                change.set(c,change.get(c)+1);
            }
        }

        OutputView.printChange(change);
    }
}
