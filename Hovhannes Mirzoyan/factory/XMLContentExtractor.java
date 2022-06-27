package patterns.factory;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;

import java.io.IOException;
import java.util.logging.Logger;

public class XMLContentExtractor implements ContentExtractor {

    private static final Logger logger = Logger.getLogger(XMLContentExtractor.class.getName());

    @Override
    public String extractContent(Document document) {
        System.out.println("Start content extraction of XML file ...");
        try {
            return new Tika().parseToString(document.getPath());
        } catch (IOException | TikaException e) {
            logger.warning("Something went wrong while extracting content.");
            throw new RuntimeException(e);
        }
    }

}
