package Composite.example2WithBridge.Classes;

import Composite.example2WithBridge.Interfaces.ICashier;

public class Cashier implements ICashier {
    private double income;

    public double getIncome() {
        return income;
    }


    @Override
    public void Sale(double price) {
        income+=price;
    }
}
