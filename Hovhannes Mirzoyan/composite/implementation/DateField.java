package patterns.composite.implementation;

import patterns.composite.interfaces.Field;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateField implements Field<LocalDateTime> {

    private final LocalDateTime time;

    private final String name;

    public DateField(String name, LocalDateTime time) {
        this.time = time;
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDateTime getValue() {
        return time;
    }

    @Override
    public void print() {
        System.out.println(String.format("\t%s", name) + " = " + getValue().format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
