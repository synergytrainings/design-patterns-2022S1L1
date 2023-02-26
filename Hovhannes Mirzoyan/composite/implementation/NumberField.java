package patterns.composite.implementation;

import patterns.composite.ValidationManager;
import patterns.composite.interfaces.Field;
import patterns.composite.model.ValidationContext;
import patterns.composite.model.ValidationError;

public class NumberField implements Field<Integer> {

    private static final String DEFAULT_FIELD_NAME = "Number";
    private final Integer value;
    private String name;

    public NumberField(Integer value) {
        this.value = value;
    }

    public NumberField(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name != null ? name : DEFAULT_FIELD_NAME;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void validate(ValidationManager validationManager, ValidationContext validationContext) {
        if (value > validationContext.getNumberFieldMaxValue()) {
            validationManager.addValidationError(new ValidationError(
                    getName(),
                    String.format("Maximum value for %s field is %d. Your value is %d", getName(), validationContext.getNumberFieldMaxValue(),
                            value))
            );
        }
    }

}
