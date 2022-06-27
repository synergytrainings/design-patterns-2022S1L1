public class Main {
    public static void main(String[] args) {
        Pizza favPizza = new Pizza.PizzaBuilder()
                .setDough(Dough.ITALIAN)
                .setSize(Size.MEDIUM)
                .setSauce(Sauce.RED)
                .setTopping(Topping.CHICKEN)
                .setTopping(Topping.VEGGIES)
                .setCheese(Cheese.CHEDDAR)
                .build();

        System.out.println(favPizza.toString());
    }
}
