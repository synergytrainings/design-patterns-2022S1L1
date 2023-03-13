package patterns.facade.implementations;

import patterns.facade.components.BrakeFluid;
import patterns.facade.components.BrakePads;
import patterns.facade.components.BrakePedal;
import patterns.facade.interfaces.BrakeSystem;

public class HydraulicsBrakeSystem implements BrakeSystem {
    private final BrakePedal brakePedal;
    private final BrakeFluid brakeFluid;
    private final BrakePads brakePads;

    public HydraulicsBrakeSystem() {
        this.brakePedal = new BrakePedal();
        this.brakeFluid = new BrakeFluid();
        this.brakePads = new BrakePads();
    }

    public void applyBrakes() {
        int power = brakePedal.getPushPower();
        brakeFluid.applyPressure(power);
        brakePads.clamp();
    }
}

