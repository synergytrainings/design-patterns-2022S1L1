package Decorator.Services;

import Decorator.Interface.HotelRoom;
import Decorator.Interface.RoomDecorator;

public class Balcony extends RoomDecorator {
    public Balcony(HotelRoom room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + ", balcony";
    }

    @Override
    public double getCost() {
        return room.getCost() + 2.0;
    }
}
