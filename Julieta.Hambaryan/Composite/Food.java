import java.util.List;

public class Food implements Component {

    private String name;
    private List<Component> components;

    public Food(String name, List<Component> components){
        this.name = name;
        this.components = components;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getCalories() {
        double calories = 0 ;
        for (Component component : this.components){
            calories += component.getCalories();
        }
        return calories;
    }


}
