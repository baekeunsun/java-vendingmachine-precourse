package vendingmachine.utils;

public enum ErrorMessage {
    INPUT_MIN_100("자판기는 100원 이상 보유하고 있어야 합니다."),
    INPUT_DIVIDE_10("자판기는 10원 단위의 돈을 보유하고 있어야 합니다."),
    INPUT_TYPE_INT("금액은 숫자여야 합니다.");

    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
