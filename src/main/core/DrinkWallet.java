package main.core;

import java.util.ArrayList;

public class DrinkWallet extends Wallet {
    public DrinkWallet() {
        super();
    }

    public void addQuantityMachine1(ArrayList quantity){
        quantity.add(10);
        quantity.add(20);
        quantity.add(20);
        quantity.add(10);
        quantity.add(5);
        quantity.add(2);
        quantity.add(1);
        quantity.add(3);
    }
}
