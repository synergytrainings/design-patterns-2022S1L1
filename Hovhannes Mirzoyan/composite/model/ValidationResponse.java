package patterns.composite.model;

import java.util.List;

public class ValidationResponse {

    private final List<ValidationError> validationErrors;

    public ValidationResponse(List<ValidationError> validationErrors) {
        this.validationErrors = validationErrors;
    }

    public List<ValidationError> getValidationErrors() {
        return validationErrors;
    }

    @Override
    public String toString() {
        return buildValidationMessage();
    }

    private String buildValidationMessage() {
        StringBuilder builder = new StringBuilder();

        validationErrors.forEach(validationError -> builder.append(String.format("%s: [%s]\n", validationError.getKey(), validationError.getMessage())));
        return builder.toString();
    }
}
