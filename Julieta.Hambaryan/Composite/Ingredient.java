public class Ingredient implements Component {

    private String name;
    private double calories;

    private double weight;

    public Ingredient(String name, double calories, double weight){
        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    @Override
    public double getCalories() {
        return this.calories * this.weight/100;
    }


    @Override
    public String getName() {
        return this.name;
    }
}
