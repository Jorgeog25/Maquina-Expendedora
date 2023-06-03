package main.core;

import java.util.ArrayList;
import java.util.Random;
    public class Machine implements Sell{
        private int id;
        private ArrayList<Product> products;
        private Wallet money;


    public Machine(int id){
        this.id = id;
        this.products = new ArrayList<>();
    }

        public ArrayList<Product> getProducts() {
            return products;
        }

        public void setProducts(ArrayList<Product> products) {
            this.products = products;
        }
        public int machineSize(){
            return this.products.size();
        }

        public int getID(){
        return this.id;
    }

    public Wallet getMoney(){
        return this.money;
    }

    public void setMoney(Wallet money){
        this.money=money;
    }

    public void productsList(){
        for(Product p:this.products){
            System.out.println(p.getName()+" "+p.getPrice()+" "+p.getUnits());
        }
    }
}