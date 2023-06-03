package main.core;

import java.util.ArrayList;

public class Wallet {

    private ArrayList<Double> value;
    private ArrayList<Integer> quantity;

    public Wallet(){
        this.value = new ArrayList<>();
        this.quantity = new ArrayList<>();
    }
    public void addValue(ArrayList value){
        value.add(0.05);
        value.add(0.10);
        value.add(0.25);
        value.add(1.0);
        value.add(2.0);
        value.add(5);
        value.add(10);
        value.add(20);
    }

    public void setValue(ArrayList<Double> value) {
        this.value = value;
    }

    public ArrayList<Integer> getQuantity(double val) {
        return quantity;
    }

    public void setQuantity(ArrayList<Integer> quantity) {
        this.quantity = quantity;
    }

    public ArrayList<Double> getValue() {
        return value;
    }
}