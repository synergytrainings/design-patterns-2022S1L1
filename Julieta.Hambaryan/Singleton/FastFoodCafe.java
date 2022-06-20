package com.company;

public class FastFoodCafe {

    public static void main(String[] args) {

        Customer customer1 = new Customer(0);
        Customer customer2 = new Customer(1);
        Customer customer3 = new Customer(2);

        customer1.makeOrder("pizza, french fries");
        customer1.payTheBill(20);
        customer2.makeOrder("chicken nuggets, soft drink");
        customer2.payTheBill(15);
        customer3.makeOrder("sandwiches, burger");
        customer3.payTheBill(23);

        Waiter waiter = Waiter.getWaiter();
        waiter.getCashAmount();
        waiter.printOrders();

    }
}
