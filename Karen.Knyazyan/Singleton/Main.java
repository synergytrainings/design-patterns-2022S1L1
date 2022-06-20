import model.Direction;
import model.Elevator;
import model.Location;
import model.Request;
import service.ElevatorService;

public class Main {
    public static void main(String[] args) {

        ElevatorService elevatorService = new ElevatorService();

        Elevator elevator = Elevator.getElevator();

        Request upRequest1 = new Request(elevator.getCurrentFloor(), 5, Location.INSIDE_ELEVATOR);
        Request upRequest2 = new Request(elevator.getCurrentFloor(), 3, Location.INSIDE_ELEVATOR);

        Request downRequest1 = new Request(elevator.getCurrentFloor(), 1, Location.INSIDE_ELEVATOR);
        Request downRequest2 = new Request(elevator.getCurrentFloor(), 2, Location.INSIDE_ELEVATOR);
        Request downRequest3 = new Request(4, 0, Location.OUTSIDE_ELEVATOR);

        System.out.println("Elevator now is at " + elevator.getCurrentFloor() + " floor");

        new Thread(elevatorService).start() ;

        elevatorService.sendUpRequest(upRequest1);
        elevatorService.sendUpRequest(upRequest2);

        elevatorService.sendDownRequest(downRequest3);

        elevatorService.sendDownRequest(downRequest1);
        elevatorService.sendDownRequest(downRequest2);
    }
}
