package com.company;


public class Main {

    public static void main(String[] args) {

        Integer horseCount = 10;
        CarouselAttraction carouselAttraction = new CarouselAttraction(horseCount);

        WhiteHorseIterator whiteHorseIterator = new WhiteHorseIterator(carouselAttraction);
        while (whiteHorseIterator.hasNext()){
            whiteHorseIterator.getNext().position = HorsePosition.UP;
        }

        BlackHorseIterator blackHorseIterator = new BlackHorseIterator(carouselAttraction);
        while (blackHorseIterator.hasNext()){
            blackHorseIterator.getNext().position = HorsePosition.DOWN;
        }

        for (int i = 0; i < horseCount ; i++ ){
            System.out.println(i + "." + "colour: " + carouselAttraction.horses.get(i).colour
                    + " " + "position: " +  carouselAttraction.horses.get(i).position );
        }

    }
}
