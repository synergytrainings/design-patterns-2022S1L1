package com.company.ClassicaInstruments.Instruments;

import com.company.instruments.Guitar;

public class ClassicalGuitar implements Guitar {

    @Override
    public void makeGuitarSound() {
        System.out.println("classical guitar sound");
    }
}
