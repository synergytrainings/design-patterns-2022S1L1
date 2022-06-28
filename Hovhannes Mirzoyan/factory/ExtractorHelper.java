package patterns.factory;

public class ExtractorHelper {

    private ExtractorHelper() {
    }

    public static ContentExtractor getContentExtractor(DocumentType documentType) {
        switch (documentType) {
            case PDF -> {
                return new PDFContentExtractor();
            }
            case XML -> {
                return new XMLContentExtractor();
            }
            default -> {
                return new DefaultContentExtractor();
            }
        }
    }
}
