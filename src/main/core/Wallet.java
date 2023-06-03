package main.core;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Wallet {

    private ArrayList<Float> value;
    private ArrayList<Integer> quantity;

    public Wallet(){
        this.value = new ArrayList<>();
        this.quantity = new ArrayList<>();
    }
    public ArrayList<Float> getValue() {
        return value;
    }

    public int getQuantity(float val){
        int pos=value.indexOf(val);
        if(pos!=-1){
            return this.quantity.get(pos);
        } else{
            return 0;
        }
    }

    public void delete(float val){
        int pos = this.value.indexOf(val);
        if(pos!=-1){
            this.value.remove(pos);
            this.quantity.remove(pos);
        }
    }

    public float getTotal(){
        float total=0;
        for(float val:this.value){
            total+=val*this.getQuantity(val);
        }
        return total;
    }

    public void information(){
        for(float val:this.value){
            if(val>=1){
                System.out.println("Dollar Bill: "+val+" -> "+this.getQuantity(val));
            }else{
                System.out.println("Coins "+val+" -> "+this.getQuantity(val));
            }
        }
    }
}