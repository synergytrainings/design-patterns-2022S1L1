interface CarBuilder {

    void setModel(String model);

    void setModelYear(int year);

    void paintCar(String color);

    void buildEngine(String engine);

    void buildTransmission(String transmission);

    void setUpHorsepower(int horsepower);

    Car complete();
}