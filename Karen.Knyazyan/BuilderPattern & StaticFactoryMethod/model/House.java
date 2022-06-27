package model;

import java.util.ArrayList;
import java.util.List;

public class House {
    protected byte floors;
    protected List<Room> bedrooms = new ArrayList<>();
    protected List<Room> kitchens = new ArrayList<>();
    protected List<Room> bathrooms = new ArrayList<>();
    protected List<Room> livingRooms = new ArrayList<>();
    protected List<Room> diningRooms = new ArrayList<>();
    protected List<Room> garages = new ArrayList<>();

    @Override
    public String toString() {
        return "House {" +
                " \n floors = " + floors +
                ", \n bedrooms = " + bedrooms +
                ", \n kitchens = " + kitchens +
                ", \n bathrooms = " + bathrooms +
                ", \n livingRooms = " + livingRooms +
                ", \n diningRooms = " + diningRooms +
                ", \n garages = " + garages +
                " \n }";
    }
}