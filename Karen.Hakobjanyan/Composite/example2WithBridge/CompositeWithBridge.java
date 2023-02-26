package Composite.example2WithBridge;

import Composite.example2WithBridge.Classes.Cashier;
import Composite.example2WithBridge.Classes.Dish;
import Composite.example2WithBridge.Classes.Ingredient;
import Composite.example2WithBridge.Interfaces.ICashier;
import Composite.example2WithBridge.Interfaces.IFastFood;

public class CompositeWithBridge {
    public static void main(String[] args) {
        ICashier cashier1 = new Cashier();
        ICashier cashier2 = new Cashier();

        IFastFood frenchFries = new Ingredient("French Fries", 200, 1, 10);
        IFastFood cola = new Ingredient("Coca cola", 350, 1, 15);

        IFastFood mushrooms1 = new Ingredient("Mushroom", 20, 4, 12);
        System.out.println(mushrooms1.getPrice());
        IFastFood tomato1 = new Ingredient("Tomato", 50, 2, 10);
        System.out.println(tomato1.getPrice());
        IFastFood onion1 = new Ingredient("Onion", 70, 1, 5);
        System.out.println(onion1.getPrice());

        IFastFood mushrooms2 = new Ingredient("Mushroom", 20, 4, 5);
        IFastFood tomato2 = new Ingredient("Tomato", 50, 2, 1);
        IFastFood onion2 = new Ingredient("Onion", 70, 1, 4);

        IFastFood pizza1 = new Dish("Pizza", 10);
        pizza1.Add(mushrooms1);
        pizza1.Add(tomato1);
        pizza1.Add(onion1);
        System.out.println("pizza1 price " + pizza1.getPrice());

        IFastFood pizza2 = new Dish("Pizza", 20);
        pizza2.Add(mushrooms2);
        pizza2.Add(tomato2);
        pizza2.Add(onion2);
        System.out.println("pizza2 price " + pizza2.getPrice());

        IFastFood lunch = new Dish("Lunch", 10);
        lunch.Add(pizza1);
        lunch.Add(pizza2);

        System.out.println("Lunch price " + lunch.getPrice());
        lunch.SaleFastFood(cashier1);
        System.out.println("Income after sale " + cashier1.getIncome());
    }
}
