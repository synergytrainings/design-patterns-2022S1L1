package StaticFactoryMethode;

public class Coffee {
    private int coffee;
    private SugarQTY sugar;
    private int milk;

    private Coffee(int coffee, SugarQTY sugar, int milk) {
        this.coffee = coffee;
        this.sugar = sugar;
        this.milk = milk;
    }

    public Coffee getEspresso(SugarQTY sugarQTY){
        return new Coffee(10, sugarQTY, 0);
    }

    public Coffee getCappuccino(SugarQTY sugarQTY) {
        return new Coffee(10, sugarQTY, 10);
    }



}

enum SugarQTY {
    NO_SUGAR,
    LOW,
    MEDIUM,
    HIGH
}