package model;

public class Room {
    private static final short REGULAR_LENGTH = 50;
    private static final short REGULAR_WIDTH = 50;
    private static final short REGULAR_HEIGHT = 50;
    private static final String REGULAR_WALL_COLOR = "White";

    public static Room createRegularSingleRoom(int floor) {
        return new Room(REGULAR_LENGTH, REGULAR_WIDTH, REGULAR_HEIGHT, REGULAR_WALL_COLOR, (byte) 1, (byte) floor);
    }
    public static Room createRegularDoubleRoom(int floor) {
        return new Room(REGULAR_LENGTH, REGULAR_WIDTH, REGULAR_HEIGHT, REGULAR_WALL_COLOR, (byte) 2, (byte) floor);
    }
    public static Room createRegularTripleRoom(int floor) {
        return new Room(REGULAR_LENGTH, REGULAR_WIDTH, REGULAR_HEIGHT, REGULAR_WALL_COLOR, (byte) 3, (byte) floor);
    }

    public static Room createRegularLivingRoom(int floor) {
        return new Room(REGULAR_LENGTH, REGULAR_WIDTH, REGULAR_HEIGHT, REGULAR_WALL_COLOR, (byte) 5, (byte) floor);
    }

    public static Room createRegularDiningRoom(int floor) {
        return Room.createRegularLivingRoom(floor);
    }

    public static Room createRegularBathroom(int floor) {
        return Room.createRegularSingleRoom((byte) floor);
    }

    public static Room createRegularKitchen(int floor) {
        return Room.createRegularTripleRoom((byte) floor);
    }

    public static Room createRegularGarage() {
        return Room.createRegularLivingRoom(0);
    }

    private short length;
    private short width;
    private short height;
    private String wallColor;
    private byte capacity;
    private byte floor;

    public Room(short length, short width, short height, String wallColor, byte capacity, byte floor) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.wallColor = wallColor;
        this.capacity = capacity;
        this.floor = floor;
    }

    public short getLength() {
        return length;
    }

    public void setLength(short length) {
        this.length = length;
    }

    public short getWidth() {
        return width;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }

    public byte getCapacity() {
        return capacity;
    }

    public void setCapacity(byte capacity) {
        this.capacity = capacity;
    }

    public byte getFloor() {
        return floor;
    }

    public void setFloor(byte floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "\n Room {" +
                "\n   length = " + length +
                ", \n   width = " + width +
                ", \n   height = " + height +
                ", \n   wallColor = " + wallColor + '\'' +
                ", \n   capacity = " + capacity +
                ", \n   floor = " + floor +
                "\n }";
    }
}
