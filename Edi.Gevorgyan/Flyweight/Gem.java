package main.flyweight;

public class Gem {

    private final String shape;
    private final String color;

    public Gem(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }

    public void draw(Board board, int raw, int column) {
        board.draw(this, raw, column);
    }
}
