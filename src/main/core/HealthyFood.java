package main.core;

public class HealthyFood extends Product {

    public HealthyFood(double price, String name, int id, int quantity) {
        super(price, name, id, quantity);
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
