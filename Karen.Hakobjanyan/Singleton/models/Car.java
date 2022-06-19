package Singleton.models;

public class Car {
    private String id;
    private Driver driver;
    private int loadCapacity;
    private boolean isAvailable;

    public Car(String id, Driver driver, int loadCapacity, boolean isAvailable) {
        this.id = id;
        this.driver = driver;
        this.loadCapacity = loadCapacity;
        this.isAvailable = isAvailable;
    }

    public Car(String id, boolean isAvailable) {
        this.id = id;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
