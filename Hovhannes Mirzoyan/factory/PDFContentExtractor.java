package patterns.factory;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import java.io.IOException;
import java.util.logging.Logger;


public class PDFContentExtractor implements ContentExtractor {
    private static final Logger logger = Logger.getLogger(PDFContentExtractor.class.getName());

    @Override
    public String extractContent(Document document) {
        System.out.println("Start content extraction of PDF file ...");
        try {
            return new Tika().parseToString(document.getPath());
        } catch (IOException | TikaException e) {
            logger.warning("Something went wrong while extracting contnent");
            throw new RuntimeException(e);
        }
    }
}
