package main.chainofresponsibility.doctors;

import main.chainofresponsibility.Person;

public class Optometrist extends Doctor {

    public Optometrist(Doctor nextDoctor) {
        super(nextDoctor);
    }

    @Override
    public boolean check(Person person) {
        boolean eyesChecked = person.getCheckupState().get("eyes");
        if (!eyesChecked) {
            // check eyes, put actual result
            person.updateCheckupState("eyes", true);
        }
        return checkNext(person);
    }
}
