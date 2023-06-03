package main.core;

public abstract class Product {

    protected double price;
    protected String name;
    protected int id;
    protected int units;

    public Product(double price, String name, int id){
        this.id = id;
        this.name = name;
        this.price = price;
        this.units = 10;
    }


    public Product(double price, String name, int id, int quantity) {
        this.price = price;
        this.name = name;
        this.id = id;
        this.units = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public abstract boolean isAvailable();

    public abstract void replanishStock(int elements);

    public abstract void upPrice(int percentage);
}
