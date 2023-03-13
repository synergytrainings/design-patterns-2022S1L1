package patterns.facade;

import patterns.facade.implementations.HydraulicsBrakeSystem;
import patterns.facade.interfaces.BrakeSystem;

public class Main {

    public static void main(String[] args) {
        BrakeSystem brakeSystem = new HydraulicsBrakeSystem();
        brakeSystem.applyBrakes();
    }

}
