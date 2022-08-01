package com.company.ClassicaInstruments;

import com.company.*;
import com.company.ClassicaInstruments.Instruments.ClassicalGuitar;
import com.company.ClassicaInstruments.Instruments.ClassicalPiano;
import com.company.instruments.Guitar;
import com.company.instruments.Piano;

public class ClassicalMusicalInstrumentsFactory implements MusicalInstrumentsFactory {

    @Override
    public Guitar createGuitar() {
        return  new ClassicalGuitar();
    }

    @Override
    public Piano createPiano() {
        return new ClassicalPiano();
    }

}
