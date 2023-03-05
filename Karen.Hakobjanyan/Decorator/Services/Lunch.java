package Decorator.Services;

import Decorator.Interface.HotelRoom;
import Decorator.Interface.RoomDecorator;

public class Lunch extends RoomDecorator {
    public Lunch(HotelRoom room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + ", Lunch";
    }

    @Override
    public double getCost() {
        return room.getCost() + 4.8;
    }
}
