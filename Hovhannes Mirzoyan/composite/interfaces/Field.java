package patterns.composite.interfaces;

import patterns.composite.ValidationManager;
import patterns.composite.model.ValidationContext;

public interface Field<T> {
    String getName();

    T getValue();

    void validate(ValidationManager validationManager, ValidationContext validationContext);
}
