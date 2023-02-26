package patterns.composite;

import patterns.composite.implementation.Form;
import patterns.composite.implementation.NumberField;
import patterns.composite.implementation.TextField;
import patterns.composite.interfaces.Field;
import patterns.composite.model.ValidationContext;

import java.util.Arrays;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Field<Integer> treeCount = new NumberField("Tree count", 200);

        Field<String> descriptionField = new TextField("Description",
                "The sky was painted with hues of" +
                        " pink and orange as the sun set over the horizon.");

        Field<Map<String, Object>> form = new Form("Forest Description Form", Arrays.asList(treeCount, descriptionField));

        ValidationManager validationManager = new ValidationManager();
        form.validate(validationManager, getValidationContext());

        if (!validationManager.isApproved()) {
            System.out.println(validationManager.toValidationResponse());
        }
    }

    private static ValidationContext getValidationContext() {
        return ValidationContext.newBuilder()
                .numberFieldMaxValue(150)
                .textMaxSize(40)
                .build();
    }
}
