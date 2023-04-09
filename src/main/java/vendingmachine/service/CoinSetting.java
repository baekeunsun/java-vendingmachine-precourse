package vendingmachine.service;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInList;

public class CoinSetting {
    public List<Integer> vendingmachineCoins;

    public CoinSetting(int vendingmachineAmount) {
        List<Integer> Coins = Arrays.asList(500,100,50,10);
        vendingmachineCoins = Arrays.asList(0,0,0,0);

        while (vendingmachineAmount != 0) {
            int tmpint = pickNumberInList(Coins);
            if (tmpint <= vendingmachineAmount) {
                vendingmachineAmount -= tmpint;
                if (tmpint == 500) {
                    vendingmachineCoins.set(0,vendingmachineCoins.get(0)+1);
                }
                if (tmpint == 100) {
                    vendingmachineCoins.set(1,vendingmachineCoins.get(1)+1);
                }
                if (tmpint == 50) {
                    vendingmachineCoins.set(2,vendingmachineCoins.get(2)+1);
                }
                if (tmpint == 10) {
                    vendingmachineCoins.set(3,vendingmachineCoins.get(3)+1);
                }
            }
        }
    }
}
