package patterns.composite;

import patterns.composite.model.ValidationError;
import patterns.composite.model.ValidationResponse;

import java.util.ArrayList;
import java.util.List;

public class ValidationManager {

    private final List<ValidationError> validationErrors;

    public ValidationManager() {
        this.validationErrors = new ArrayList<>();
    }

    public void addValidationError(ValidationError validationError) {
        this.validationErrors.add(validationError);
    }

    public ValidationResponse toValidationResponse() {
        return new ValidationResponse(validationErrors);
    }

    public boolean isApproved() {
        return this.validationErrors.isEmpty();
    }
}
