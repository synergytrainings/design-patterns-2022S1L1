package com.company;

public class CarouselHorse {

    private static Integer number = 0;
    HorseColour colour;
    HorsePosition position = HorsePosition.MIDDLE;

    public CarouselHorse(HorseColour colour){
        this.colour = colour;
    }
}
