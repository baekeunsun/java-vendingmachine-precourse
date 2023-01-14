package vendingmachine.view;

import vendingmachine.utils.Validate;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    static Validate validate = new Validate();

    public static int getVendingmachineAmount() {
        System.out.println("자판기가 보유하고 있는 금액을 입력해 주세요.");
        return validate.validateVendingmachineAmount();
    }

    public static List<String> getProduct() {
        System.out.println("상품명과 가격, 수량을 입력해 주세요.");
        return validate.validateProduct();
    }

    public static int getInputAmount() {
        System.out.println("투입 금액을 입력해 주세요.");
        return validate.validateInputAmount();
    }

    public static String getPurchaseProduct() {
        System.out.println("구매할 상품명을 입력해 주세요.");
        return readLine();
    }
}
