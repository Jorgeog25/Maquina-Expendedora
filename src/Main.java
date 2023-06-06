import main.core.*;
import main.print.MachinePrinting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DrinkWallet walletMachine1 = new DrinkWallet();
        List<Double> valueMachine1 = new ArrayList<>();
        List<Integer> quantityMachine1 = new ArrayList<>();
        walletMachine1.addValue((ArrayList<Double>) valueMachine1);
        walletMachine1.addQuantityMachine1((ArrayList<Integer>) quantityMachine1);
        walletMachine1.setQuantity((ArrayList<Integer>) quantityMachine1);
        walletMachine1.setValue((ArrayList<Double>) valueMachine1);
        /* adds the values and quantities to the wallet of the first machine */

        HealthyWallet walletMachine2 = new HealthyWallet();
        List<Double> valueMachine2 = new ArrayList<>();
        List<Integer> quantityMachine2 = new ArrayList<>();
        walletMachine2.addValue((ArrayList<Double>) valueMachine2);
        walletMachine2.addQuantityMachine2((ArrayList<Integer>) quantityMachine2);
        walletMachine2.setQuantity((ArrayList<Integer>) quantityMachine2);
        walletMachine2.setValue((ArrayList<Double>) valueMachine2);
        /* adds the values and quantities to the wallet of the second machine */

        UnhealthyWallet walletMachine3 = new UnhealthyWallet();
        List<Double> valueMachine3 = new ArrayList<>();
        List<Integer> quantityMachine3 = new ArrayList<>();
        walletMachine3.addValue((ArrayList<Double>) valueMachine3);
        walletMachine3.addQuantityMachine3((ArrayList<Integer>) quantityMachine3);
        walletMachine3.setQuantity((ArrayList<Integer>) quantityMachine3);
        walletMachine3.setValue((ArrayList<Double>) valueMachine3);
        /* adds the values and quantities to the wallet of the third machine */

        Machine drinkMachine = new Machine(1, walletMachine1);
        List<Product> drinksList = new ArrayList<>();
        Machine healthyMachine = new Machine(2, walletMachine2);
        List<Product> snacksList = new ArrayList<>();
        Machine unhealthyMachine = new Machine(3, walletMachine3);
        List<Product> unhealthyList = new ArrayList<>();
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

        UnhealthyFood chips = new UnhealthyFood(1, "Chips", 10, 10);
        UnhealthyFood chocolate = new UnhealthyFood(2, "Chocolate", 50, 10);
        UnhealthyFood cookies = new UnhealthyFood(3, "Cookies", 30, 10);
        UnhealthyFood candy = new UnhealthyFood(4, "Candy", 12, 10);
        unhealthyList.add(chips);
        unhealthyList.add(chocolate);
        unhealthyList.add(cookies);
        unhealthyList.add(candy);


        drinkMachine.setProducts((ArrayList<Product>) drinksList);
        healthyMachine.setProducts((ArrayList<Product>) snacksList);
        unhealthyMachine.setProducts((ArrayList<Product>) unhealthyList);

        machinePrinting.printMachineProducts(drinkMachine, drinkMachine.getID());
        machinePrinting.printMachineProducts(healthyMachine, healthyMachine.getID());
        machinePrinting.printMachineProducts(unhealthyMachine, unhealthyMachine.getID());

        Management management = new Management();
        management.selectMachine();

    }
}