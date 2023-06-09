import main.core.*;
import main.print.MachinePrinting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        Wallet walletMachine1 = new Wallet();
        walletMachine1.addCoins();
        /* adds the values and quantities to the wallet of the first machine */

        Wallet walletMachine2 = new Wallet();
        walletMachine2.addCoins();
        /* adds the values and quantities to the wallet of the second machine */

        Wallet walletMachine3 = new Wallet();
        walletMachine3.addCoins();
        /* adds the values and quantities to the wallet of the third machine */

        Machine drinkMachine = new Machine(1, walletMachine1);
        List<Product> drinksList = new ArrayList<>();
        Machine healthyMachine = new Machine(2, walletMachine2);
        List<Product> snacksList = new ArrayList<>();
        Machine unhealthyMachine = new Machine(3, walletMachine3);
        List<Product> unhealthyList = new ArrayList<>();
        MachinePrinting machinePrinting = new MachinePrinting();
        /* initializes the machines */

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
        /*list of products */

        drinkMachine.setProducts((ArrayList<Product>) drinksList);
        healthyMachine.setProducts((ArrayList<Product>) snacksList);
        unhealthyMachine.setProducts((ArrayList<Product>) unhealthyList);
        /* adds the products to the machines */


        Options options = new Options(4);
        options.add("Buy a product");
        options.add("Refill a product");
        options.add("See wallet of the machine");
        options.add("Exit");
        /* add the options to the menu */


        boolean exit = true;
        int optionSelected;
        Management management = new Management();

        do{
            options.print();
            optionSelected = options.askOption();
            machinePrinting.printMachineProducts(drinkMachine, drinkMachine.getID());
            machinePrinting.printMachineProducts(healthyMachine, healthyMachine.getID());
            machinePrinting.printMachineProducts(unhealthyMachine, unhealthyMachine.getID());
            if (optionSelected == 1){
                switch (management.selectMachine()){
                    case 1:
                        machinePrinting.printMachineProducts(drinkMachine, drinkMachine.getID());
                        System.out.println("Select the product you want to buy");
                        drinkMachine.buyProduct(management.askNumber(), drinkMachine.getMoney());
                        break;
                    case 2:
                        machinePrinting.printMachineProducts(healthyMachine, healthyMachine.getID());
                        System.out.println("Select the product you want to buy");
                        healthyMachine.buyProduct(management.askNumber(), healthyMachine.getMoney());
                        break;
                    case 3:
                        machinePrinting.printMachineProducts(unhealthyMachine, unhealthyMachine.getID());
                        System.out.println("Select the product you want to buy");
                        unhealthyMachine.buyProduct(management.askNumber(), unhealthyMachine.getMoney());
                        break;
                }
            } else if (optionSelected == 2){
                switch (management.selectMachine()){
                    case 1:
                        machinePrinting.printMachineProducts(drinkMachine, drinkMachine.getID());
                        System.out.println("Which product we have to refill?");
                        drinkMachine.showRefilling(drinkMachine.refillProduct(management.askNumber()));
                        break;
                    case 2:
                        machinePrinting.printMachineProducts(healthyMachine, healthyMachine.getID());
                        System.out.println("Which product we have to refill?");
                        drinkMachine.showRefilling(healthyMachine.refillProduct(management.askNumber()));
                        break;
                    case 3:
                        machinePrinting.printMachineProducts(unhealthyMachine, unhealthyMachine.getID());
                        System.out.println("Which product we have to refill?");
                        drinkMachine.showRefilling(unhealthyMachine.refillProduct(management.askNumber()));
                        break;
                }
            } else if(optionSelected == 3){
                switch (management.selectMachine()){
                    case 1:
                        drinkMachine.getMoney().printWallet();
                        break;
                    case 2:
                        healthyMachine.getMoney().printWallet();
                        break;
                    case 3:
                        unhealthyMachine.getMoney().printWallet();
                        break;
                }
            } else if(optionSelected == 4){
                exit = false;
            } else {
                System.out.println("Invalid option");
            }
        }while(exit);



    }
}