public class BMWCarBuilder implements CarBuilder {
    private final Car car;

    public BMWCarBuilder() {
        this.car = new Car();
        this.car.setMark("BMW");
    }

    @Override
    public void setModel(String model) {
        System.out.println("BMW: setting up model");
        this.car.setModel(model);
    }

    @Override
    public void setModelYear(int year) {
        System.out.println("BMW: setting up year");
        this.car.setYear(year);
    }

    @Override
    public void paintCar(String color) {
        System.out.println("BMW: painting a car");
        this.car.setColor(color);
    }

    @Override
    public void buildEngine(String engine) {
        System.out.println("BMW: building an engine");
        this.car.setEngine(engine);
    }

    @Override
    public void buildTransmission(String transmission) {
        System.out.println("BMW: building a transmission");
        this.car.setTransmission(transmission);
    }

    @Override
    public void setUpHorsepower(int horsepower) {
        System.out.println("BMW: setting up horsepower");
        this.car.setHorsepower(horsepower);
    }

    @Override
    public Car complete() {
        return this.car;
    }
}
