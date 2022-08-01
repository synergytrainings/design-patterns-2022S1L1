package com.company;

import java.util.List;

public class BlackHorseIterator implements CarouselHorseIterator{

    private int currentHorsePosition = 0;
    private List<CarouselHorse> horses;

    public BlackHorseIterator(CarouselAttraction carouselAttraction){
        this.horses = carouselAttraction.horses;
    }

    @Override
    public boolean hasNext() {
        for ( int i = currentHorsePosition ; i < horses.size(); ++i){
            if(horses.get(i).colour == HorseColour.BLACK){
                return true;
            }
        }
        return false;
    }

    @Override
    public CarouselHorse getNext() {
        if (!hasNext()) {
            return null;
        }
        for ( int i = currentHorsePosition ; i < horses.size(); ++i){
            currentHorsePosition ++;
            if(horses.get(i).colour == HorseColour.BLACK){
                return horses.get(i);
            }
        }
        return null;
    }

    @Override
    public void reset() {
        currentHorsePosition = 0;
    }
}
