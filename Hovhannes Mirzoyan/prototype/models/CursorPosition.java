package patterns.prototype.models;

import patterns.prototype.interfaces.Duplicable;

public class CursorPosition implements Duplicable<CursorPosition> {

    private double distance;

    private double angle;

    public CursorPosition(int x, int y) {
        this.distance = calculateDistance(x, y);
        this.angle = calculateAngle(x, y);
    }


    //copy constructor
    private CursorPosition(CursorPosition cursorPosition) {
        this.distance = cursorPosition.distance;
        this.angle = cursorPosition.angle;
    }


    @Override
    public CursorPosition duplicate() {
        return new CursorPosition(this);
    }

    private double calculateDistance(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    private double calculateAngle(int x, int y) {
        return Math.atan((double) y / x);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CursorPosition{");
        sb.append("distance=").append(distance);
        sb.append(", angle=").append(angle);
        sb.append('}');
        return sb.toString();
    }
}
