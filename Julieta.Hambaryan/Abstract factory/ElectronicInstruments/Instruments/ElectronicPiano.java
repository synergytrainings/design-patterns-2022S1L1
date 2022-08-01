package com.company.ElectronicInstruments.Instruments;

import com.company.instruments.Piano;

public class ElectronicPiano implements Piano {
    @Override
    public void makePianoSound() {
        System.out.println("electronic piano sound");
    }
}
