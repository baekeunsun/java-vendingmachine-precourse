package vendingmachine.view;

import java.util.Arrays;
import java.util.List;

public class OutputView {
    static List<Integer> Coins = Arrays.asList(500,100,50,10);

    public static void printVendingmachineAmount(List<Integer> vendingmachineCoins) {
        System.out.println("자판기가 보유한 동전");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%d원 - %d개 %n", Coins.get(i),vendingmachineCoins.get(i));
        }
    }

    public static void printInputAmount(int inputAmount) {
        System.out.printf("투입 금액: %d원 %n", inputAmount);
    }

    public static void printChange(List<Integer> change) {
        System.out.println("잔돈");
        for (int i = 0; i < 4; i++) {
            if (change.get(i) > 0) {
                System.out.printf("%d원 - %d개 %n", Coins.get(i),change.get(i));
            }
        }
    }

    public static void printError(String message) {
        System.out.println("[ERROR]" + message);
    }
}
