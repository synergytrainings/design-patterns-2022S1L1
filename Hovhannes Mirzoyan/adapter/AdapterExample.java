package patterns.adapter;

import patterns.adapter.implementations.IphoneCharger;
import patterns.adapter.implementations.SamsungCharger;
import patterns.adapter.interfaces.CTypeCharger;
import patterns.adapter.interfaces.LightningCharger;

public class AdapterExample {

    public static void main(String[] args) {
        LaptopBattery laptopBattery = new LaptopBattery();

        CTypeCharger charger = new SamsungCharger();

        laptopBattery.chargeLaptop(charger);

        LightningCharger lightningCharger = new IphoneCharger();
        LightningChargerAdapter lightningChargerAdapter = new LightningChargerAdapter(lightningCharger);

        //set iphone for charge
        laptopBattery.chargeLaptop(lightningChargerAdapter);
    }
}
