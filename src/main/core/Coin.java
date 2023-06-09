package main.core;

public class Coin {
    public double value;
    public int quantity;

    public Coin(double value, int quantity){
        this.value = value;
        this.quantity = quantity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
