package main.print;

import main.core.Machine;
import main.core.Product;
import java.util.ArrayList;
import java.util.List;

public class MachinePrinting {
    private int machineHigh;
    private int machineBroad;

    public MachinePrinting() {
        this.machineHigh = 30;
        this.machineBroad = 15;
    }

    public void printMachineProducts(Machine machine, int machineId) {
        String productName;
        int productId;
        boolean fileInUse = false;
        int a = 0;
        System.out.println("Machine " + machineId);
        for (int i = 0; i < machineBroad; i++) {
            for (int j = 0; j < machineHigh; j++) {
                if (i == 0 && j == machineHigh - 1) {
                    System.out.print("=");
                    System.out.println();
                } else if (i==0 ){
                System.out.print("=");
                } else if (j == 0) {
                    System.out.print("|");
                } else if (j == machineHigh - 1){
                    System.out.println("|");
                    fileInUse = false;
                } else if (i == machineBroad - 1) {
                    System.out.print("=");
                } else {
                    try {
                        if (!fileInUse) {
                            productName = machine.getProducts().get(a).getName();
                            productId = machine.getProducts().get(a).getProductId();
                            System.out.print("       " + productName + "->" + productId);
                            machineHigh -= (productName.length() + 10);
                            a++;
                            fileInUse = true;
                        } else {
                            System.out.print(" ");
                        }
                    } catch (IndexOutOfBoundsException e) {
                        System.out.print(" ");

                    }
                }
            }
            machineHigh = 30;
        }
    }
}
