package vendingmachine.controller;


import vendingmachine.service.CoinSetting;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;



public class MainController {
    public MainController() {
        int vendingmachineAmount = InputView.getVendingmachineAmount();
        OutputView.printVendingmachineAmount(new CoinSetting(vendingmachineAmount).vendingmachineCoins);
    }
}
