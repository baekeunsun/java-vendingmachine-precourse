package vendingmachine.view;

import java.util.List;

public class OutputView {

    public static void printVendingmachineAmount(List<Integer> vendingmachineCoins) {
        System.out.println("자판기가 보유한 동전");
        System.out.printf("500원 - %d개 %n", vendingmachineCoins.get(0));
        System.out.printf("100원 - %d개 %n", vendingmachineCoins.get(1));
        System.out.printf("50원 - %d개 %n", vendingmachineCoins.get(2));
        System.out.printf("10원 - %d개 %n", vendingmachineCoins.get(3));
    }

    public static void printInputAmount(int inputAmount) {
        System.out.printf("투입 금액: %d원 %n", inputAmount);
    }
}
