package main.core;

public class HealthyFood extends Product {

    private final double weight;

    public HealthyFood(double price, String name, int id, int quantity) {
        super(price, name, id, quantity);
        this.weight = 100;
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
