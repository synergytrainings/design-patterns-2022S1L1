package singleton;

import java.util.Objects;

public class PrimeMinister {
    private static PrimeMinister primeMinister;

    private String name;

    private String surname;

    private String country;

    private PrimeMinister() {

    }

    public static PrimeMinister getPresident() {
        synchronized (PrimeMinister.class) {
            if (Objects.isNull(primeMinister)) {
                primeMinister = new PrimeMinister();
            }
            return primeMinister;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void doDecision(String decision) {
        System.out.println("I accept decision to " + decision + ".");
    }
}
