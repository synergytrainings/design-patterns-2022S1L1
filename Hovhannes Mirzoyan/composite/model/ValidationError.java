package patterns.composite.model;

public class ValidationError {
    private final String key;

    private final String message;

    public ValidationError(String key, String error) {
        this.key = key;
        this.message = error;
    }

    public String getKey() {
        return key;
    }

    public String getMessage() {
        return message;
    }
}
