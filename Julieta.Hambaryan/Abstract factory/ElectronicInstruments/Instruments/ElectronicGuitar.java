package com.company.ElectronicInstruments.Instruments;

import com.company.instruments.Guitar;

public class ElectronicGuitar implements Guitar {

    @Override
    public void makeGuitarSound() {
        System.out.println("electronic guitar sound");
    }
}
