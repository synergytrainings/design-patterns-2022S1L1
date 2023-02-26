package patterns.composite.model;

public final class ValidationContext {
    private int numberFieldMaxValue;

    private int textFieldMaxSize;

    private ValidationContext() {
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public int getNumberFieldMaxValue() {
        return numberFieldMaxValue;
    }

    public int getTextFieldMaxSize() {
        return textFieldMaxSize;
    }

    public static class Builder {
        private final ValidationContext validationContext;

        private Builder() {
            this.validationContext = new ValidationContext();
        }

        public Builder numberFieldMaxValue(int maxValue) {
            this.validationContext.numberFieldMaxValue = maxValue;
            return this;
        }

        public Builder textMaxSize(int textMaxSize) {
            this.validationContext.textFieldMaxSize = textMaxSize;
            return this;
        }

        public ValidationContext build() {
            return this.validationContext;
        }
    }
}
