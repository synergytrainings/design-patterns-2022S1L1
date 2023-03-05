package Decorator.Interface;

public abstract class RoomDecorator implements HotelRoom{
    protected HotelRoom room;
    public RoomDecorator(HotelRoom room){
        this.room = room;
    }

    public String getDescription(){
        return room.getDescription();
    }
}
