package patterns.adapter;

import patterns.adapter.interfaces.CTypeCharger;
import patterns.adapter.interfaces.LightningCharger;

public class LightningChargerAdapter implements CTypeCharger {

    private final LightningCharger lightningCharger;

    public LightningChargerAdapter(LightningCharger lightningCharger) {
        this.lightningCharger = lightningCharger;
    }

    @Override
    public void charge() {
        lightningCharger.charge();
    }
}
