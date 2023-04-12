package patterns.visitor;

import patterns.visitor.file.models.File;
import patterns.visitor.file.models.FileSystemItem;
import patterns.visitor.file.models.Folder;

import java.io.IOException;
import java.io.InputStream;

public class ContentExtractVisitor implements FileSystemItemVisitor {

    private final StringBuilder folderContentBuilder;

    public ContentExtractVisitor() {
        folderContentBuilder = new StringBuilder();
    }

    @Override
    public String visitFile(File file) {
        return extractContentFromFileSystemItem(file);
    }

    @Override
    public String visitFolder(Folder folder) {

        folder.getFileSystemItems().forEach(item -> {
            if (!item.isFolder()) {
                folderContentBuilder.append(extractContentFromFileSystemItem(item));
                folderContentBuilder.append("-----------------------------------------\n");
            }else {
                folderContentBuilder.append(visitFolder((Folder) item));
            }
        });

        return folderContentBuilder.toString();
    }

    private String extractContentFromFileSystemItem(FileSystemItem item) {

        try (InputStream readStream = item.open()) {
            return new String(readStream.readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException(String.format("Can not extract %s file content.", item.getName()));
        }

    }
}
