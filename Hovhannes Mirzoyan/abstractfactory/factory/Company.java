package patterns.abstractfactory.factory;

import patterns.abstractfactory.model.interfaces.Keyboard;
import patterns.abstractfactory.model.interfaces.Mouse;

public abstract class Company {

   public abstract Mouse createMouse();

   public abstract Keyboard createKeyboard();
}
