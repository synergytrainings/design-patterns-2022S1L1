package main.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Person {

    private final String name;
    private final int age;

    private final Map<String, Boolean> checkupState = new HashMap<String, Boolean>() {{
        put("eyes", false);
        put("heart", false);
        put("brain", false);
    }};

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Map<String, Boolean> getCheckupState() {
        return checkupState;
    }

    public void updateCheckupState(String organ, Boolean checked) {
        this.checkupState.put(organ, checked);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
