package patterns.abstractfactory.model.implementations;

import patterns.abstractfactory.model.interfaces.Keyboard;

public class SamsungKeyboard implements Keyboard {
    @Override
    public void print(char c) {
        System.out.println("Samsung keyboard print: " + c);
    }
}
