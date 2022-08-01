enum CarMark {
    MERCEDES_BENZ, BMW
}

enum CarType {
    SEDAN, COUPE, ROADSTER
}

abstract class Car {
    CarMark carMark = null;
    CarType carType = null;

    Car(CarMark carMark, CarType carType) {
        this.carMark = carMark;
        this.carType = carType;
    }

    abstract void getAvailableCars();

    public CarMark getCarMark() {
        return carMark;
    }

    public void setCarMark(CarMark carMark) {
        this.carMark = carMark;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString()
    {
        return "CarMark - " + carMark + " type: "+ carType;
    }
}

class MercedesBenz extends Car {

    MercedesBenz(CarType carType) {
        super(CarMark.MERCEDES_BENZ, carType);
    }

    @Override
    void getAvailableCars() {
        // calls to Mercedes Benz databases
        System.out.println("Available cars: ...");
    }
}

class BMW extends Car {

    BMW(CarType carType) {
        super(CarMark.BMW, carType);
    }

    @Override
    void getAvailableCars() {
        // calls to BMW databases
        System.out.println("Available cars: ...");
    }
}

class Sedan extends Car {

    Sedan(CarMark carMark) {
        super(carMark, CarType.SEDAN);
    }

    @Override
    void getAvailableCars() {
        // calls to all Sedans databases
        System.out.println("Available cars: ...");
    }
}

class Coupe extends Car {

    Coupe(CarMark carMark) {
        super(carMark, CarType.COUPE);
    }

    @Override
    void getAvailableCars() {
        // calls to all Coupe databases
        System.out.println("Available cars: ...");
    }
}

class Roadster extends Car {

    Roadster(CarMark carMark) {
        super(carMark, CarType.ROADSTER);
    }

    @Override
    void getAvailableCars() {
        // calls to all Roadster databases
        System.out.println("Available cars: ...");
    }
}

class CarFactory {
    private CarFactory() {
    }

    Car car = null;


    public static Car getCar(int userId, CarType carType) {
        CarMark carMark = getRecommantedMark(userId);
        switch (carType) {
            case COUPE:
                return new Coupe(carMark);
            case ROADSTER:
                return new Roadster(carMark);
            default:
                return new Sedan(carMark);

        }
    }

    private static CarMark getRecommantedMark(int userId) {
        //TODO:: AI based recommendation system
        switch (userId) {
            case 1:
            case 2:
            case 3:
                return CarMark.BMW;
            default:
                return CarMark.MERCEDES_BENZ;
        }
    }
}

class AbstractDesign {
    public static void main(String[] args) {
        System.out.println(CarFactory.getCar(1, CarType.SEDAN));
        System.out.println(CarFactory.getCar(777, CarType.ROADSTER));
        System.out.println(CarFactory.getCar(11, CarType.COUPE));
    }
}
