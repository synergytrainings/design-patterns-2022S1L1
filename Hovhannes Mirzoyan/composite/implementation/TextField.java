package patterns.composite.implementation;


import patterns.composite.ValidationManager;
import patterns.composite.interfaces.Field;
import patterns.composite.model.ValidationContext;
import patterns.composite.model.ValidationError;

public class TextField implements Field<String> {
    private static final String DEFAULT_FIELD_NAME = "Text";
    private final String text;
    private String name;

    public TextField(String text) {
        this.text = text;
    }

    public TextField(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String getName() {
        return name != null ? name : DEFAULT_FIELD_NAME;
    }

    @Override
    public String getValue() {
        return text;
    }

    @Override
    public void validate(ValidationManager validationManager, ValidationContext validationContext) {
        int textSizeWithoutSpaces = text.trim().replaceAll("\\s", "").length();
        if (textSizeWithoutSpaces > validationContext.getTextFieldMaxSize()) {
            validationManager.addValidationError(new ValidationError(
                    getName(),
                    String.format("Maximum character count is %d. Your count is %d", validationContext.getTextFieldMaxSize(), textSizeWithoutSpaces)
            ));
        }
    }
}
