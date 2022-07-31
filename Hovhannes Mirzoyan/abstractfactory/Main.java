package patterns.abstractfactory;

import patterns.abstractfactory.factory.Company;
import patterns.abstractfactory.factory.SamsungFactory;
import patterns.abstractfactory.factory.XiaomiFactory;
import patterns.abstractfactory.model.interfaces.Keyboard;
import patterns.abstractfactory.model.interfaces.Mouse;

public class Main {
    public static void main(String[] args) {
        Company xiaomi = new XiaomiFactory();
        Mouse xiaomiMouse = xiaomi.createMouse();
        Keyboard xiaomiKeyboard = xiaomi.createKeyboard();

        Company samsung = new SamsungFactory();
        Mouse samsungMouse = samsung.createMouse();
        Keyboard samsungKeyboard = samsung.createKeyboard();

        xiaomiMouse.move();
        samsungMouse.move();

        System.out.println();

        samsungKeyboard.print('s');
        xiaomiKeyboard.print('x');

    }
}
