package main.core;

public class Accesories extends Product implements Sell{

    private int units;
    private int stock;

    public Accesories(double price, String name, int id) {
        super(price, name, id);
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void replanishStock(int elements) {

    }

    @Override
    public void upPrice(int percentage) {

    }


}
