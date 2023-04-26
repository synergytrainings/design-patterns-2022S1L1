package main.chainofresponsibility.doctors;

import main.chainofresponsibility.Person;

public class Neurologist extends Doctor {

    public Neurologist(Doctor nextDoctor) {
        super(nextDoctor);
    }

    @Override
    public boolean check(Person person) {
        boolean brainChecked = person.getCheckupState().get("brain");
        if (!brainChecked) {
            // check brain, put actual result
            person.updateCheckupState("brain", true);
        }
        return checkNext(person);
    }
}
