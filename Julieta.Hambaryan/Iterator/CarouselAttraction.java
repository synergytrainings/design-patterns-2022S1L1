package com.company;

import java.util.ArrayList;
import java.util.List;

public class CarouselAttraction {

    List<CarouselHorse> horses = new ArrayList<>();

    CarouselAttraction(Integer horseCount){
        for (int i = 0 ; i < horseCount; ++i){
            this.horses.add(new CarouselHorse(HorseColour.values()[(int) Math.round( Math.random() )]));
        }
    }

}
