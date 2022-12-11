package vendingmachine.utils;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Validate {

    public int validateVendingmachineAmount() {
        int input = Integer.valueOf(readLine());
        if (input < 100) {
            throw new IllegalArgumentException("자판기는 100원 이상 보유하고 있어야 합니다.");
        }
        if (input %10 != 0) {
            throw new IllegalArgumentException("자판기는 10원 단위의 돈을 보유하고 있어야 합니다.");
        }
        return input;
    }
}
