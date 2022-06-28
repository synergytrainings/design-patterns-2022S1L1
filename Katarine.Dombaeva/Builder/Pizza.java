import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final Dough dough;
    private final Sauce sauce;
    private final Size size;
    private final Cheese cheese;
    private final List<Topping> toppings;

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.dough = pizzaBuilder.dough;
        this.sauce = pizzaBuilder.sauce;
        this.size = pizzaBuilder.size;
        this.cheese = pizzaBuilder.cheese;
        this.toppings = pizzaBuilder.toppings;
    }

    public static class PizzaBuilder {
        private Dough dough;
        private Sauce sauce;
        private Size size;
        private Cheese cheese;
        private List<Topping> toppings = new ArrayList<>();

        public PizzaBuilder setDough(Dough dough){
            this.dough = dough;
            return this;
        }

        public PizzaBuilder setSauce(Sauce sauce){
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder setSize(Size size){
            this.size = size;
            return this;
        }

        public PizzaBuilder setCheese(Cheese cheese){
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder setTopping(Topping topping){
            this.toppings.add(topping);
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Size getSize() {
        return size;
    }

    public Cheese getCheese() { return cheese; }

    public List<Topping> getToppings() {
        return toppings;
    }
}
