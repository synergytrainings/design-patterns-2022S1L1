import model.House;
import model.HouseBuilder;
import model.Room;

public class Main {
    public static void main(String[] args) {

        Room singleBedroom = Room.createRegularSingleRoom(1);
        Room tripleBedroom = Room.createRegularTripleRoom(1);
        Room livingRoom = Room.createRegularLivingRoom(1);
        Room diningRoom = Room.createRegularDiningRoom(1);
        Room bathroom = Room.createRegularBathroom(1);
        Room kitchen = Room.createRegularKitchen(1);
        Room garage = Room.createRegularGarage();

        HouseBuilder newHouseBuilder = new HouseBuilder();
        newHouseBuilder.addBathroom(bathroom).addBedroom(singleBedroom).addBedroom(tripleBedroom).addLivingRoom(livingRoom)
                .addDiningRoom(diningRoom).addKitchen(kitchen).addGarage(garage);

        House newHouse = newHouseBuilder.buildHouse();

        System.out.println("My new House : " + newHouse);
    }
}
