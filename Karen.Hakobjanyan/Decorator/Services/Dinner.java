package Decorator.Services;

import Decorator.Interface.HotelRoom;
import Decorator.Interface.RoomDecorator;

public class Dinner extends RoomDecorator {
    public Dinner(HotelRoom room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + ", Dinner";
    }

    @Override
    public double getCost() {
        return room.getCost() + 7.1;
    }
}
