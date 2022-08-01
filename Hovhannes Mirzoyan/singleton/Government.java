package singltone;

import java.util.Objects;

public class Government {

    private static volatile Government government;

    private PrimeMinister primeMinister;

    private String decision;

    private Government() {
        this.decision = "increase workers salary";
    }

    public static Government getGovernment() {
        if(Objects.isNull(government))
        synchronized (Government.class) {
            if (Objects.isNull(government)) {
                government = new Government();
            }
        }
        return government;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getDecision() {
        return this.decision;
    }

    public void governmentMeeting() {
        System.out.println("At the government meeting primeMinister will accept or deny this decision.");
        primeMinister.doDecision(decision);
    }

    public PrimeMinister getPresident() {
        return primeMinister;
    }

    public void setPresident(PrimeMinister primeMinister) {
        this.primeMinister = primeMinister;
    }
}
