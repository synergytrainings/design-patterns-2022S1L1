package Decorator.Rooms;

import Decorator.Interface.HotelRoom;

public class DoubleRoom implements HotelRoom {
    @Override
    public String getDescription() {
        return "Room with double bed";
    }

    @Override
    public double getCost() {
        return 35.0;
    }
}
