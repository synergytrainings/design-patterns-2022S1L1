package main.chainofresponsibility.doctors;

import main.chainofresponsibility.Person;

public class Cardiologist extends Doctor {

    public Cardiologist(Doctor nextDoctor) {
        super(nextDoctor);
    }

    @Override
    public boolean check(Person person) {
        boolean heartChecked = person.getCheckupState().get("heart");
        if (!heartChecked) {
            // check heart, put actual result
            person.updateCheckupState("heart", true);
        }
        return checkNext(person);
    }
}
