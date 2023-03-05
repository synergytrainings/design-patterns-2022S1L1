package Decorator.Services;

import Decorator.Interface.HotelRoom;
import Decorator.Interface.RoomDecorator;

public class Breakfast extends RoomDecorator {
    public Breakfast(HotelRoom room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + ", Breakfast";
    }

    @Override
    public double getCost() {
        return room.getCost() + 5.2;
    }
}
