package vendingmachine.controller;


import vendingmachine.domain.Product;
import vendingmachine.service.CoinSetting;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

import java.util.*;


public class MainController {
    static Map<String,Product> products = new HashMap<>();
    static int vendingmachineAmount;
    static int inputAmount;
    static CoinSetting vendingmachine;

    public MainController() {
        coinSetting();
        productSetting();
        inputAmountSetting();
    }

    public static void run() {
        purchaseProduct();
        makeChange();
    }

    public static void coinSetting() {
        vendingmachineAmount = InputView.getVendingmachineAmount();
        vendingmachine = new CoinSetting(vendingmachineAmount);
        OutputView.printVendingmachineAmount(vendingmachine.vendingmachineCoins);
    }

    public static void productSetting() {
        for (String product : InputView.getProduct()) {
            Product tmpProduct = new Product(product);
            products.put(tmpProduct.name, tmpProduct);
        }
    }

    public static void inputAmountSetting() {
        inputAmount = InputView.getInputAmount();
    }

    public static void purchaseProduct() {
        boolean buy = true;
        while (buy) {
            OutputView.printInputAmount(inputAmount);
            if (checkBuy()) {
                purchase();
                continue;
            }
            buy = false;
        }
    }

    private static void purchase() {
        Product nowPurchaseProduct =  products.get(InputView.getPurchaseProduct());
        if (nowPurchaseProduct.price <= inputAmount) {
            nowPurchaseProduct.count -= 1;
            inputAmount -= nowPurchaseProduct.price;
        }
    }

    private static boolean checkBuy() {
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
            return false;
        }
        return true;
    }

    public static void makeChange() {
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
