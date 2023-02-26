package patterns.composite.implementation;


import patterns.composite.interfaces.Field;

public class TextField implements Field<String> {
    private final String text;
    private final String name;

    public TextField(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return text;
    }

    @Override
    public void print() {
        System.out.printf("\t%s = %s%n", getName(), getValue());
    }

}
