package patterns.adapter.implementations;

import patterns.adapter.interfaces.LightningCharger;

public class IphoneCharger implements LightningCharger {
    @Override
    public void charge() {
        System.out.println("Charge Iphone.");
    }
}
