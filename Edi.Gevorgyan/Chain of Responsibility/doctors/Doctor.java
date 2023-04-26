package main.chainofresponsibility.doctors;

import main.chainofresponsibility.Person;

public abstract class Doctor {

    private final Doctor nextDoctor;

    public Doctor(Doctor nextDoctor) {
        this.nextDoctor = nextDoctor;
    }

    public abstract boolean check(Person person);

    protected boolean checkNext(Person person) {
        if (nextDoctor == null) {
            return true;
        }
        return nextDoctor.check(person);
    }
}
