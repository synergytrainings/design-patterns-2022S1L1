package model;

public class HouseBuilder extends House{

    private final House house;

    public HouseBuilder() {
        this.house = new House();
    }

    public HouseBuilder addFloor() {
        ++this.house.floors;
        return this;
    }

    public HouseBuilder addBedroom(Room bedroom) {
        this.house.bedrooms.add(bedroom);
        return this;
    }

    public HouseBuilder addKitchen(Room kitchen) {
        this.house.kitchens.add(kitchen);
        return this;
    }

    public HouseBuilder addBathroom(Room bathroom) {
        this.house.bathrooms.add(bathroom);
        return this;
    }

    public HouseBuilder addLivingRoom(Room livingRoom) {
        this.house.livingRooms.add(livingRoom);
        return this;
    }

    public HouseBuilder addDiningRoom(Room diningRoom) {
        this.house.diningRooms.add(diningRoom);
        return this;
    }

    public HouseBuilder addGarage(Room garage) {
        this.house.garages.add(garage);
        return this;
    }

    public House buildHouse() {
        return this.house;
    }
}
