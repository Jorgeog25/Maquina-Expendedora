package main.core;

import java.util.ArrayList;
import java.util.List;

public class Wallet {

    private ArrayList<Coin> coins;
    public Wallet(){
        this.coins = new ArrayList<>();
    }
    public void addCoins(){
        this.coins.add(new Coin(20.00, 10));
        this.coins.add(new Coin(10.00, 10));
        this.coins.add(new Coin(5.00, 10));
        this.coins.add(new Coin(2.00, 10));
        this.coins.add(new Coin(1.00, 10));
        this.coins.add(new Coin(0.50, 10));
        this.coins.add(new Coin(0.20, 10));
        this.coins.add(new Coin(0.10, 10));
        this.coins.add(new Coin(0.05, 10));

    }
    public int total() {
        int total = 0;
        for (Coin c : this.coins) {
            total += c.getValue() * c.getQuantity();
        }
        return total;
    }
    public void checkCoins(double change){
        boolean changePossible = true;
        double changeToUser = change;
        for(Coin c:this.coins) {
            do {
                if (c.getValue() <= change) {
                    c.setQuantity(c.getQuantity() - 1);
                    change -= c.getValue();

                }
            } while (c.getValue() <= change);
        }
        System.out.println("Your change is: "+changeToUser);
    }
    public void checkToAddCoins(double price){

        for(Coin c:this.coins) {
            if (c.getValue() <= price) {
                c.setQuantity(c.getQuantity() + 1);
                price -= c.getValue();
            }
        }
    }
    public void printWallet(){
        for(Coin c:this.coins){
            System.out.println(c.getValue()+"€ -- "+c.getQuantity());
        }
    }
}