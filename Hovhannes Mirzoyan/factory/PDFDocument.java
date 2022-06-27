package patterns.factory;

import java.nio.file.Path;

public class PDFDocument extends Document {
    private final Boolean searchable;

    public PDFDocument(Path path, double size, Boolean searchable) {
        super(path, size);
        this.searchable = searchable;
    }

    public Boolean isSearchable() {
        return searchable;
    }

    public Boolean getSearchable() {
        return searchable;
    }
}
