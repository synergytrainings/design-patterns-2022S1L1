package main.observer;

public class Demo {

    public static void main(String[] args) {

        Blabbermouth blabbermouth = new Blabbermouth("buffetGoodies", "playStation");
        RichKid richKid = new RichKid(blabbermouth);
        richKid.setDailyCashAmount(5000);

        richKid.blabbermouth.subscribe("buffetGoodies", new GourmandKid(true, 1000));
        richKid.blabbermouth.subscribe("playStation", new GamerKid(3000));

        try {
            richKid.goToBuffet();
            richKid.goToGameClubAfterSchool();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
