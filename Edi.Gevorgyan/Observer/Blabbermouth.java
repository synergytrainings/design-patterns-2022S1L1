package main.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Blabbermouth {

    Map<String, List<DishonestKid>> dishonestKids = new HashMap<>();

    public Blabbermouth(String... benefits) {
        for (String benefit : benefits) {
            this.dishonestKids.put(benefit, new ArrayList<>());
        }
    }

    public void subscribe(String benefit, DishonestKid dishonestKid) {
        List<DishonestKid> dishonestKidsForSameBenefit = this.dishonestKids.get(benefit);
        dishonestKidsForSameBenefit.add(dishonestKid);
    }

    public void unsubscribe(String benefit, DishonestKid dishonestKid) {
        List<DishonestKid> dishonestKidsForSameBenefit = this.dishonestKids.get(benefit);
        dishonestKidsForSameBenefit.remove(dishonestKid);
    }

    public void blabber(String benefit, Integer cashAmount) {
        List<DishonestKid> dishonestKidsForSameBenefit = this.dishonestKids.get(benefit);
        for (DishonestKid dishonestKid : dishonestKidsForSameBenefit) {
            dishonestKid.reconsiderCommunication(benefit, cashAmount);
        }
    }
}
