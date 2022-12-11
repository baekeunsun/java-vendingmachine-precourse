package vendingmachine;

import vendingmachine.controller.MainController;
import vendingmachine.view.InputView;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInList;

public class Application {
    public static void main(String[] args) {
        new MainController();
    }
}
