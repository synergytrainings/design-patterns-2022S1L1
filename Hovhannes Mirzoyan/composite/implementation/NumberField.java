package patterns.composite.implementation;

import patterns.composite.interfaces.Field;
import patterns.composite.model.ValidationContext;
import patterns.composite.model.ValidationError;

public class NumberField implements Field<Integer> {

    private final Integer value;
    private final String name;

    public NumberField(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void print() {
        System.out.printf("\t%s = %d", getName(),getValue());
    }

}
