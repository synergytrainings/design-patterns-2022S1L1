package Composite.example2WithBridge.Classes;

import Composite.example2WithBridge.Interfaces.ICashier;
import Composite.example2WithBridge.Interfaces.IFastFood;

public class Ingredient implements IFastFood {
    private String name;
    private double price;
    private double costPrice;
    private int qty;

    public Ingredient(String name, double costPrice, int qty, int percent) {
        this.name = name;
        this.costPrice = costPrice;
        this.qty = qty;
        setPrice(percent);
    }


    public double getCostPrice() {
        return costPrice * qty;
    }

    @Override
    public void SaleFastFood(ICashier cashier) {
        cashier.Sale(price);
    }

    @Override
    public void setPrice(int percent){
        price += getCostPrice() * (100 + percent) / 100;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void Add(IFastFood ingredient) {

    }

    @Override
    public void Remove(IFastFood ingredient) {

    }


}
