package patterns.abstractfactory.model.implementations;

import patterns.abstractfactory.model.interfaces.Mouse;

public class XiaomiMouse implements Mouse {
    @Override
    public void move() {
        System.out.println("Xiaomi mouse is moving...");
    }
}
