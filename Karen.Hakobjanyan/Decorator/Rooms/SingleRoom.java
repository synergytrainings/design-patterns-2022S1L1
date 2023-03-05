package Decorator.Rooms;

import Decorator.Interface.HotelRoom;

public class SingleRoom implements HotelRoom {
    @Override
    public String getDescription() {
        return "Room with single bed";
    }

    @Override
    public double getCost() {
        return 19.9;
    }
}
