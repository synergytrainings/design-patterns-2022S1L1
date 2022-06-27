package patterns.factory;

public class DefaultContentExtractor implements ContentExtractor{
    @Override
    public String extractContent(Document document) {
        System.out.println("Start content extraction by Default Extractor ... ");
        return "Default text";
    }
}
