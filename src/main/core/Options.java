package main.core;

import java.util.Scanner;

public class Options {
    private String items[];
    private int capacity;
    private int size;
    private int defaultSelection;

    public Options() {
        this.capacity = 10;
        this.size = 0;
        this.defaultSelection = 0;
        this.items = new String[capacity];
    }

    public Options(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.defaultSelection = (capacity - 1);
        this.items = new String[capacity];
    }

    public void add(String item) {
        if (size < capacity) {
            items[size] = item;
            size++;
        }
    }

    public String[] getItems() {
        return items;
    }

    public String getItem(int index) {

        if (index < 0 || index >= size) {
            return null;
        }

        return items[index];
    }

    public int getSize() {
        return size;
    }

    public int getDefaultSelection() {
        return defaultSelection;
    }
    public void setDefaultSelection(int defaultSelection) {
        this.defaultSelection = defaultSelection;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1)+ ". " + items[i]);
        }
    }
    public int askOption(){
        int option = 0;
        Scanner optionSelection = new Scanner(System.in);
        option = optionSelection.nextInt();
        return option;
    }
    public int decision(int option){
        if (option == 1) {
            return 1;
        } else if (option == 2) {
            return 2;
        } else if (option == 3) {
            return 3;
        } else {
            System.out.println("Invalid option");
            return 4;
        }
    }
}
