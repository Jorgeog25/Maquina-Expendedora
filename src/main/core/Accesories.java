package main.core;

public class Accesories extends Product implements Sell{

    private int units;
    private int stock;

    public Accesories(double price, String name, int id) {
        super(price, name, id);
    }

    @Override
    public boolean isAvailable() {

        if(stock>0){
            return true;
        }
        return false;
    }

    @Override
    public void replanishStock(int elements) {
        if(stock<=0){

        }

    }

    @Override
    public void upPrice(int percentage) {

    }

    @Override
    public Wallet changueManagement(Wallet clientMoney, float productPrice) {
        return null;
    }

    @Override
    public Alerts jamMaybe() {
        return null;
    }

    @Override
    public Alerts failureMaybe() {
        return null;
    }
}
