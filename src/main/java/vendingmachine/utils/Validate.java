package vendingmachine.utils;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class Validate {

    public int validateVendingmachineAmount() {
        try {
            int input = Integer.valueOf(readLine());
            if (input < 100) {
                throw new IllegalArgumentException(ErrorMessage.INPUT_MIN_100.getMessage());
            }
            if (Integer.valueOf(input) %10 != 0) {
                throw new IllegalArgumentException(ErrorMessage.INPUT_DIVIDE_10.getMessage());
            }
            return Integer.valueOf(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_TYPE_INT.getMessage());
        }
    }

    public List<String> validateProduct() {
        List<String> products = Arrays.asList(readLine().split(";"));
        for (String product : products) {
            String[] input = product.substring(1,product.length()-1).split(",");
            if (input.length !=3) {
                throw new IllegalArgumentException(ErrorMessage.PRODUCT_SIZE_3.getMessage());
            }
        }
        return products;
    }

    public int validateInputAmount() {
        try {
            int input = Integer.valueOf(readLine());
            return Integer.valueOf(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_TYPE_INT.getMessage());
        }
    }

    public String validatePurchaseProduct() {
        String input = readLine();
        return input;
    }
}
