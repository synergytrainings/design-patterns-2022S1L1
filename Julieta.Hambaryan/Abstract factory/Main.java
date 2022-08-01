package com.company;

import com.company.ClassicaInstruments.ClassicalMusicalInstrumentsFactory;
import com.company.ElectronicInstruments.ElectronicMusicalInstrumentsFactory;
import com.company.instruments.Guitar;
import com.company.instruments.Piano;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        MusicalInstrumentsFactory musicalInstrumentsFactory;
        if ("electric".equals(type)){
            musicalInstrumentsFactory = new ElectronicMusicalInstrumentsFactory();
        }
        else if ("classic".equals(type)){
            musicalInstrumentsFactory = new ClassicalMusicalInstrumentsFactory();
        }
        else {
            throw new IllegalStateException("No such a type");
        }

        Guitar guitar = musicalInstrumentsFactory.createGuitar();
        Piano piano = musicalInstrumentsFactory.createPiano();
        guitar.makeGuitarSound();
        piano.makePianoSound();
    }
}
