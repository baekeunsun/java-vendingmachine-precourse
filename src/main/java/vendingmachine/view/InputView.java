package vendingmachine.view;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public static int getVendingmachineAmount() {
        System.out.println("자판기가 보유하고 있는 금액을 입력해 주세요.");
        return Integer.valueOf(readLine());
    }

    public static List<String> getProduct() {
        System.out.println("상품명과 가격, 수량을 입력해 주세요.");
        List<String> input = Arrays.asList(readLine().split(";"));
        return input;
    }

    public static int getInputAmount() {
        System.out.println("투입 금액을 입력해 주세요.");
        return Integer.valueOf(readLine());
    }
}
