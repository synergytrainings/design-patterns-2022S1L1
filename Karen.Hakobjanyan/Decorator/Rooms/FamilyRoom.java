package Decorator.Rooms;

import Decorator.Interface.HotelRoom;

public class FamilyRoom implements HotelRoom {
    @Override
    public String getDescription() {
        return "Two double and one single bed";
    }

    @Override
    public double getCost() {
        return 69.9;
    }
}
