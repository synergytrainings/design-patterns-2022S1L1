package patterns.composite.implementation;

import patterns.composite.ValidationManager;
import patterns.composite.interfaces.Field;
import patterns.composite.model.ValidationContext;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Form implements Field<Map<String, Object>> {
    private final String formName;
    private final List<Field<?>> fields;

    public Form(String formName, List<Field<?>> fields) {
        this.formName = formName;
        this.fields = fields;
    }

    @Override
    public String getName() {
        return formName;
    }

    @Override
    public Map<String, Object> getValue() {
        return this.fields
                .stream()
                .collect(Collectors.toMap(Field::getName, Field::getValue));
    }

    @Override
    public void validate(ValidationManager validationManager, ValidationContext validationContext) {
        fields.forEach(field -> field.validate(validationManager, validationContext));
    }
}
