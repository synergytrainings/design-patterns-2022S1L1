package patterns.factory;

import org.apache.tika.exception.TikaException;

import java.io.IOException;

public interface ContentExtractor {

    String extractContent(Document document) throws TikaException, IOException;

}
