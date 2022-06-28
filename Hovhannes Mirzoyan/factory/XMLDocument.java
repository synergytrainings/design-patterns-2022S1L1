package patterns.factory;

import java.nio.file.Path;

public class XMLDocument extends Document{
    private final Boolean markup;

    public XMLDocument(Path path, double size, Boolean markup) {
        super(path, size);
        this.markup = markup;
    }

    public Boolean isMarkup() {
        return markup;
    }
}
