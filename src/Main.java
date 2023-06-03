import main.core.*;
import main.print.MachinePrinting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Machine drinkMachine = new Machine(1);
        List<Product> drinksList = new ArrayList<>();
        Machine snackMachine = new Machine(2);
        List<Product> snacksList = new ArrayList<>();
        MachinePrinting machinePrinting = new MachinePrinting();

        Drinks cocaCola = new Drinks(1, "Coca Cola", 10, 10);
        Drinks fanta = new Drinks(2, "Fanta", 50, 10);
        Drinks sprite = new Drinks(3, "Sprite", 30, 10);
        Drinks pepsi = new Drinks(4, "Pepsi", 12, 10);
        Drinks mirinda = new Drinks(5, "Mirinda", 20, 10);
        drinksList.add(cocaCola);
        drinksList.add(fanta);
        drinksList.add(sprite);
        drinksList.add(pepsi);
        drinksList.add(mirinda);

        HealthyFood apple = new HealthyFood(1, "Apple", 10, 10);
        HealthyFood banana = new HealthyFood(2, "Banana", 50, 10);
        HealthyFood orange = new HealthyFood(3, "Orange", 30, 10);
        HealthyFood pear = new HealthyFood(4, "Pear", 12, 10);
        snacksList.add(apple);
        snacksList.add(banana);
        snacksList.add(orange);
        snacksList.add(pear);


        drinkMachine.setProducts((ArrayList<Product>) drinksList);
        snackMachine.setProducts((ArrayList<Product>) snacksList);

        machinePrinting.printMachineProducts(drinkMachine, drinkMachine.getID());
        machinePrinting.printMachineProducts(snackMachine, snackMachine.getID());

        DrinksManagement drinksManagement = new DrinksManagement();
        drinksManagement.selectMachine();

    }
}