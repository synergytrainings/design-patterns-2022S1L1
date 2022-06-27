package patterns.factory;


import org.apache.tika.exception.TikaException;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws TikaException, IOException {
        Document pdfDocument = new PDFDocument(Path.of("C:\\Users\\User\\examples\\first.pdf"), 11.5, false);
        Document xmlDocument = new XMLDocument(Path.of("C:\\Users\\User\\examples\\second.pdf"), 4.5, true);


        ContentExtractor pdfExtractor = ExtractorHelper.getContentExtractor(DocumentType.PDF);

        String pdfContent = pdfExtractor.extractContent(pdfDocument);

        System.out.println(pdfContent + "\n");


        ContentExtractor xmlExtractor = ExtractorHelper.getContentExtractor(DocumentType.XML);

        String xmlContent = xmlExtractor.extractContent(xmlDocument);

        System.out.println(xmlContent);

    }
}
