package patterns.abstractfactory.factory;

import patterns.abstractfactory.model.implementations.XiaomiKeyboard;
import patterns.abstractfactory.model.implementations.XiaomiMouse;
import patterns.abstractfactory.model.interfaces.Keyboard;
import patterns.abstractfactory.model.interfaces.Mouse;

public class XiaomiFactory extends Company{
    @Override
    public Mouse createMouse() {
        return new XiaomiMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new XiaomiKeyboard();
    }
}
