package model;

public class Request {
    private final int currentFloor;
    private final int destinationFloor;
    private final Location location;

    public Request (int currentFloor, int destinationFloor, Location location) {
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
        this.location = location;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public Location getLocation() {
        return location;
    }
}

