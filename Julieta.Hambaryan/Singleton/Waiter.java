package com.company;

import java.util.ArrayList;

public class Waiter {
    private static Waiter oneAndOnlyWaiter;
    private ArrayList<String> ordersList = new ArrayList<> ();
    private final String name;
    private int cashAmount = 0;

    private Waiter(String name){
        this.name = name;
    }

    public static Waiter getWaiter(){
        if (oneAndOnlyWaiter == null) {
            synchronized (Waiter.class) {
                if (oneAndOnlyWaiter == null) {
                    oneAndOnlyWaiter = new Waiter("James");
                }
            }
        }
        return oneAndOnlyWaiter;
    }

    public void getCashAmount(){
        System.out.println("Total cash: " +  this.cashAmount);
    }

    public void printOrders(){
        for(int i = 0 ; i < ordersList.size() ; ++i){
            System.out.println("Customer No: " + i + " - " + "Order: " + ordersList.get(i));
        }
    }

    public void takeTheOrder(String order){
        ordersList.add(order);
    }

    public void getMoney(int money){
        cashAmount += money;
    }
}
