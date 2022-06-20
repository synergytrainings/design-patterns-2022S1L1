package service;

import model.Direction;
import model.Elevator;
import model.Location;
import model.Request;

public class ElevatorService implements Runnable {
    final static Elevator elevator = Elevator.getElevator();

    public void run() {

        while (!elevator.getUpQueue().isEmpty() || !elevator.getDownQueue().isEmpty()) {
            if (elevator.getDirection() == Direction.UP) {
                if (!elevator.getUpQueue().isEmpty()) {
                    elevator.setTargetFloor(elevator.getUpQueue().peek().getDestinationFloor());
                }
            } else if (elevator.getDirection() == Direction.DOWN) {
                if (!elevator.getDownQueue().isEmpty()) {
                    elevator.setTargetFloor(elevator.getDownQueue().peek().getDestinationFloor());
                }
            } else {
                if (!elevator.getUpQueue().isEmpty()) {
                    elevator.setTargetFloor(elevator.getUpQueue().peek().getDestinationFloor());
                } else if (!elevator.getDownQueue().isEmpty()) {
                    elevator.setTargetFloor(elevator.getDownQueue().peek().getDestinationFloor());
                }
            }

            if (elevator.getCurrentFloor() < elevator.getTargetFloor()) {
                elevator.setDirection(Direction.UP);
            } else if (elevator.getCurrentFloor() > elevator.getTargetFloor()) {
                elevator.setDirection(Direction.DOWN);
            } else {
                elevator.setDirection(Direction.IDLE);
            }

            if (elevator.getCurrentFloor() < elevator.getTargetFloor()) {
                elevator.goUp();
            } else if (elevator.getCurrentFloor() > elevator.getTargetFloor()) {
                elevator.goDown();
            }
            if (elevator.getCurrentFloor() == elevator.getTargetFloor()) {
                if (!elevator.getDownQueue().isEmpty() && elevator.getDownQueue().peek().getDestinationFloor() == elevator.getTargetFloor()) {
                    elevator.getDownQueue().poll();
                } else if (!elevator.getUpQueue().isEmpty() && elevator.getUpQueue().peek().getDestinationFloor() == elevator.getTargetFloor()) {
                    elevator.getUpQueue().poll();
                }
                System.out.println("*** Elevator stopped at floor " + elevator.getTargetFloor() + " ***\nDoors are opening...\n");
            }
            if (!elevator.getUpQueue().isEmpty() || !elevator.getDownQueue().isEmpty()) {
                if (elevator.getUpQueue().isEmpty()) {
                    elevator.setDirection(Direction.DOWN);
                }
                if (elevator.getDownQueue().isEmpty()) {
                    elevator.setDirection(Direction.UP);
                }
                System.out.println("Elevator is at " + elevator.getCurrentFloor() + " floor and going " + elevator.getDirection());
            }
        }

        elevator.setDirection(Direction.IDLE);
        System.out.println("Elevator is at " + elevator.getCurrentFloor() + " floor and going " + elevator.getDirection());
        System.out.println("Finished all requests.");
    }

    public void sendDownRequest(Request downRequest) {
        if (downRequest.getLocation() == Location.OUTSIDE_ELEVATOR) {
            elevator.getDownQueue().offer(new Request(downRequest.getCurrentFloor(),
                    downRequest.getCurrentFloor(),
                    Location.OUTSIDE_ELEVATOR));
        }
        elevator.getDownQueue().offer(downRequest);
    }

    public void sendUpRequest(Request upRequest) {
        if (upRequest.getLocation() == Location.OUTSIDE_ELEVATOR) {
            elevator.getUpQueue().offer(new Request(upRequest.getCurrentFloor(),
                    upRequest.getCurrentFloor(),
                    Location.OUTSIDE_ELEVATOR));
        }
        elevator.getUpQueue().offer(upRequest);
    }
}

