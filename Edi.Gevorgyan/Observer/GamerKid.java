package main.observer;

public class GamerKid implements DishonestKid {

    private final Integer gamingHunger;

    public GamerKid(Integer gamingHunger) {
        this.gamingHunger = gamingHunger;
    }

    @Override
    public void reconsiderCommunication(String benefit, Integer cashAmount) {
        if (gamingHunger < cashAmount) {
            System.out.printf("I like %s, so I will be nice to that rich kid )))%n", benefit);
        }
    }
}
