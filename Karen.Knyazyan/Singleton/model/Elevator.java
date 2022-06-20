package model;

import java.util.PriorityQueue;

public class Elevator {
    private static Elevator _elevator;
    private int currentFloor;
    private int targetFloor;
    private Direction direction;
    private final PriorityQueue<Request> upQueue;
    private final PriorityQueue<Request> downQueue;

    private Elevator() {
        this.currentFloor = 0;
        this.targetFloor = 0;
        this.direction = Direction.IDLE;
        this.upQueue = new PriorityQueue<>((floor_1, floor_2) -> floor_1.getDestinationFloor() - floor_2.getDestinationFloor());
        this.downQueue = new PriorityQueue<>((floor_1, floor_2) -> floor_2.getDestinationFloor() - floor_1.getDestinationFloor());
    }

    public static Elevator getElevator() {
        if (_elevator == null) {
            _elevator = new Elevator();
        }
        return _elevator;
    }

    public void goUp() {
        this.currentFloor++;
    }

    public void goDown() {
        this.currentFloor--;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public PriorityQueue<Request> getUpQueue() {
        return upQueue;
    }

    public PriorityQueue<Request> getDownQueue() {
        return downQueue;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getTargetFloor() {
        return targetFloor;
    }

    public void setTargetFloor(int targetFloor) {
        this.targetFloor = targetFloor;
    }
}
