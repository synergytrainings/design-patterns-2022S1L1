package com.company;

public class Customer {
    public int customerNo;

    public Customer(int customerNo){
     this.customerNo =  customerNo;
    }

    private Waiter callWaiter(){
        return Waiter.getWaiter();
    }
    public void makeOrder(String order){
        this.callWaiter().takeTheOrder(order);
    }

    public void payTheBill(int money){
        this.callWaiter().getMoney(money);
    }
}
