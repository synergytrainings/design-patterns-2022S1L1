package patterns.composite;

import patterns.composite.implementation.DateField;
import patterns.composite.implementation.Form;
import patterns.composite.implementation.TextField;
import patterns.composite.interfaces.Field;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //leaf fields
        Field<String> firstName = new TextField("First Name", "James");

        Field<String> lastName = new TextField("Last Name", "Bond");

        Field<String> email = new TextField("Email", "james.bond007@gmail.com");

        Field<LocalDateTime> startDate = new DateField("Start Date",
                LocalDateTime.of(2019, Month.APRIL, 5, 0, 0, 0)
        );

        Field<LocalDateTime> endDate = new DateField("End date",
                LocalDateTime.of(2021, Month.JANUARY, 5, 0, 0, 0));


        //compound filed
        Field<Map<String, Object>> dateSubForm = new Form("Time", Arrays.asList(startDate, endDate));

        Field<Map<String, Object>> generalForm = new Form("General Form", Arrays.asList(
                firstName, lastName, email, dateSubForm
        ));

        //print all form
        generalForm.print();
    }
}
