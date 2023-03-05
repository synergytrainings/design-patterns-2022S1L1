package Decorator;

import Decorator.Interface.HotelRoom;
import Decorator.Rooms.DoubleRoom;
import Decorator.Services.Balcony;
import Decorator.Services.Lunch;
import Decorator.Services.View;

public class Decorator {
    public static void main(String[] args) {
        HotelRoom room1 = new DoubleRoom();
        room1 = new Balcony(room1);
        room1 = new View(room1);
        room1 = new Lunch(room1);

        System.out.println(room1.getDescription() + " " + room1.getCost());
    }
}
