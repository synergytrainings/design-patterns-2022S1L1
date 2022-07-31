package patterns.abstractfactory.model.implementations;

import patterns.abstractfactory.model.interfaces.Keyboard;

public class XiaomiKeyboard implements Keyboard {
    @Override
    public void print(char c) {
        System.out.println("Xiaomi keyboard print: " + c);
    }
}
