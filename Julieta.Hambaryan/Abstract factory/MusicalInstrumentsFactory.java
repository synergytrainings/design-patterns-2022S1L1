package com.company;

import com.company.instruments.Guitar;
import com.company.instruments.Piano;

public interface MusicalInstrumentsFactory {
    Guitar createGuitar();
    Piano createPiano();
}
