package Decorator.Services;

import Decorator.Interface.HotelRoom;
import Decorator.Interface.RoomDecorator;

public class View extends RoomDecorator {
    public View(HotelRoom room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + ", nice view";
    }

    @Override
    public double getCost() {
        return room.getCost() + 3.5;
    }
}
