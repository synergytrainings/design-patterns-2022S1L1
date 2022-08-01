package com.company.ClassicaInstruments.Instruments;

import com.company.instruments.Piano;

public class ClassicalPiano implements Piano {

    @Override
    public void makePianoSound() {
        System.out.println("classical piano sound");
    }
}
