public class CarEngineer {
    private final CarBuilder carBuilder;

    public CarEngineer(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car buildCar(String model, int year, String color, String engine, int horsepower, String transmission) {
        this.carBuilder.setModel(model);
        this.carBuilder.setModelYear(year);
        this.carBuilder.paintCar(color);
        this.carBuilder.buildEngine(engine);
        this.carBuilder.setUpHorsepower(horsepower);
        this.carBuilder.buildTransmission(transmission);
        return this.carBuilder.complete();
    }
}
