package com.company.ElectronicInstruments;

import com.company.*;
import com.company.ElectronicInstruments.Instruments.ElectronicGuitar;
import com.company.ElectronicInstruments.Instruments.ElectronicPiano;
import com.company.instruments.Guitar;
import com.company.instruments.Piano;

public class ElectronicMusicalInstrumentsFactory implements MusicalInstrumentsFactory {

    @Override
    public Guitar createGuitar() {
        return new ElectronicGuitar();
    }

    @Override
    public Piano createPiano() {
        return new ElectronicPiano();
    }
}
