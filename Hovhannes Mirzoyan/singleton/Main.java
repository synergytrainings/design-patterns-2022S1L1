package singleton;

public class Main {
    public static void main(String[] args) {
        PrimeMinister primeMinister = PrimeMinister.getPresident();

        primeMinister.setName("Joe");
        primeMinister.setSurname("Biden");
        primeMinister.setCountry("USA");

        Government government = Government.getGovernment();
        government.setPresident(primeMinister);

        government.governmentMeeting();

        Government government1 = Government.getGovernment();
        government1.setDecision("reduce taxes");
        government1.governmentMeeting();

        System.out.println(government.getPresident().getName() + "\n"
                            + government1.getPresident().getName());

        Integer[] a = {8};
        Object[] o = a;

    }
}
