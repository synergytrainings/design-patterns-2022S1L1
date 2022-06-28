import java.util.HashMap;
import java.util.Map;

public class MultilingualValue {
    private final Map<Integer, String> values;
    Language language;
    int languageId;

    public MultilingualValue(Map<Integer, String> values) {
        this.values = values;
    }

    public static MultilingualValue createMultilingualValueFromString(String value, int languageId) {
        this.values = new HashMap();
        this.values.put(languageId, value);
        return new MultilingualValue(this.values);
    }

    public Map<Integer, String> getValues() {
        return values;
    }
}
