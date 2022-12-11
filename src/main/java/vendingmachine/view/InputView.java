package vendingmachine.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public static int getVendingmachineAmount() {
        System.out.println("자판기가 보유하고 있는 금액을 입력해 주세요.");
        return Integer.valueOf(readLine());
    }
}
