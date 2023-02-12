package patterns.adapter;

import patterns.adapter.interfaces.CTypeCharger;

public class LaptopBattery {

    void chargeLaptop(CTypeCharger charger){
        charger.charge();
    }
}
