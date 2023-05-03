package main.observer;

public class GourmandKid implements DishonestKid {

    private Boolean gluttonyActivated;
    private final Integer gluttonyLevel;

    public GourmandKid(Boolean gluttonyActivated, Integer gluttonyLevel) {
        this.gluttonyActivated = gluttonyActivated;
        this.gluttonyLevel = gluttonyLevel;
    }

    @Override
    public void reconsiderCommunication(String benefit, Integer cashAmount) {
        if (gluttonyActivated && gluttonyLevel < cashAmount) {
            System.out.printf("I like %s, so I will be nice to that rich kid )))%n", benefit);
        }
    }

    public void changeGluttonyState() {
        this.gluttonyActivated = !this.gluttonyActivated;
    }
}
