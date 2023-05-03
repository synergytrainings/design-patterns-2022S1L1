package main.observer;

public class RichKid {

    public Blabbermouth blabbermouth;
    public Integer cashAmount;

    public RichKid(Blabbermouth blabbermouth) {
        this.blabbermouth = blabbermouth;
    }

    public void setDailyCashAmount(Integer cashAmount) {
        this.cashAmount = cashAmount;
    }

    public void goToBuffet() {
        this.blabbermouth.blabber("buffetGoodies", this.cashAmount);
    }

    public void goToGameClubAfterSchool() throws Exception {
        if (this.cashAmount >= 3000) {
            this.blabbermouth.blabber("playStation", this.cashAmount);
        } else {
            throw new Exception("Dishonest kids love to play only playStation5");
        }
    }
}
