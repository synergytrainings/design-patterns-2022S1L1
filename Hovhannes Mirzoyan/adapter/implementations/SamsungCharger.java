package patterns.adapter.implementations;

import patterns.adapter.interfaces.CTypeCharger;

public class SamsungCharger implements CTypeCharger {
    @Override
    public void charge() {
        System.out.println("Charge Samsung.");
    }
}
