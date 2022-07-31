package patterns.abstractfactory.factory;

import patterns.abstractfactory.model.implementations.SamsungKeyboard;
import patterns.abstractfactory.model.implementations.SamsungMouse;
import patterns.abstractfactory.model.interfaces.Keyboard;
import patterns.abstractfactory.model.interfaces.Mouse;

public class SamsungFactory extends Company{
    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }
}
