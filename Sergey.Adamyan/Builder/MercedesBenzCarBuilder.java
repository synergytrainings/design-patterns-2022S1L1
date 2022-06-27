public class MercedesBenzCarBuilder implements CarBuilder {
    private final Car car;

    public MercedesBenzCarBuilder() {
        this.car = new Car();
        this.car.setMark("Mercedes Benz");
    }

    @Override
    public void setModel(String model) {
        System.out.println("Mercedes Benz: setting up model");
        this.car.setModel(model);
    }

    @Override
    public void setModelYear(int year) {
        System.out.println("Mercedes Benz: setting up year");
        this.car.setYear(year);
    }

    @Override
    public void paintCar(String color) {
        System.out.println("Mercedes Benz: painting a car");
        this.car.setColor(color);
    }

    @Override
    public void buildEngine(String engine) {
        System.out.println("Mercedes Benz: building an engine");
        this.car.setEngine(engine);
    }

    @Override
    public void buildTransmission(String transmission) {
        System.out.println("Mercedes Benz: building a transmission");
        this.car.setTransmission(transmission);
    }

    @Override
    public void setUpHorsepower(int horsepower) {
        System.out.println("Mercedes Benz: setting up horsepower");
        this.car.setHorsepower(horsepower);
    }

    @Override
    public Car complete() {
        return this.car;
    }
}