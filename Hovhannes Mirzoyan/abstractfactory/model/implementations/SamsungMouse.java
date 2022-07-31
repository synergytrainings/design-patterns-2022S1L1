package patterns.abstractfactory.model.implementations;

import patterns.abstractfactory.model.interfaces.Mouse;

public class SamsungMouse implements Mouse {
    @Override
    public void move() {
        System.out.println("Samsung mouse is moving...");
    }
}
