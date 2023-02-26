package Composite.example2WithBridge.Classes;

import Composite.example2WithBridge.Interfaces.ICashier;
import Composite.example2WithBridge.Interfaces.IFastFood;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dish implements IFastFood {
    private String name;
    private double price;
    private int percent;
    List<IFastFood> ingredients = new ArrayList<>();

    public Dish(String name, int percent) {
        this.name = name;
        this.percent = percent;
    }
    public String getName(){
        return name;
    }
    @Override
    public void Add(IFastFood ingredient){
        ingredients.add(ingredient);
        setPrice(percent);
    }

    @Override
    public void Remove(IFastFood ingredient){
        ingredients.remove(ingredient);
    }

    @Override
    public void setPrice(int percent){
        price = getCostPrice() * (100 + percent) / 100;
    }

    public double getPrice() {
        if(price == 0){
            System.out.println("Please add ingredients");
        }
        return price;
    }

    @Override
    public double getCostPrice(){
        double costPrice = 0;
        for (IFastFood ingredients: ingredients){
            costPrice += ingredients.getCostPrice();
        }
        return costPrice;
    }

    @Override
    public void SaleFastFood(ICashier cashier) {
        cashier.Sale(price);
    }
}
