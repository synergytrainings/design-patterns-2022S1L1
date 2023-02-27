import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Component> doughIngredients = new ArrayList<>();
        doughIngredients.add(new Ingredient("Flour",364,500));
        doughIngredients.add(new Ingredient("Water",0,300));
        doughIngredients.add(new Ingredient("Olive oil",884.1,50));
        doughIngredients.add(new Ingredient("Yeast",104.9,8));

        Component pizzaDough = new Food("pizza dough", doughIngredients);



        List<Component> sauceIngredients = new ArrayList<>();
        sauceIngredients.add(new Ingredient("Tomatoes",18,800));
        sauceIngredients.add(new Ingredient("Garlic",18,111));
        sauceIngredients.add(new Ingredient("Salt",0,4));

        Component pizzaSauce = new Food("pizza sauce", sauceIngredients);



        List<Component> toppingIngredients = new ArrayList<>();
        toppingIngredients.add(new Ingredient("Mushroom", 22.2, 200));
        toppingIngredients.add(new Ingredient("Ham", 145, 150));

        Component pizzaTopping = new Food("pizza topping", toppingIngredients);



        Ingredient cheese = new Ingredient("Mozzarella", 280, 400);

        List<Component> pizzaComponents = new ArrayList<>();
        pizzaComponents.add(pizzaDough);
        pizzaComponents.add(pizzaSauce);
        pizzaComponents.add(pizzaTopping);
        pizzaComponents.add(cheese);

        Food pizza = new Food("pizza", pizzaComponents);

        System.out.println("pizza kcalories: " + pizza.getCalories());
    }
}