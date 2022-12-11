package vendingmachine.utils;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class Validate {

    public int validateVendingmachineAmount() {
        int input = Integer.valueOf(readLine());
        if (!isNumber(input)) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_TYPE_INT.getMessage());
        }
        if (input < 100) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_MIN_100.getMessage());
        }
        if (input %10 != 0) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_DIVIDE_10.getMessage());
        }
        return input;
    }
}
