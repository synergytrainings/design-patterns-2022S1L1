package patterns.visitor;

import patterns.visitor.file.models.File;
import patterns.visitor.file.models.FileSystemItem;
import patterns.visitor.file.models.Folder;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ContentExtractVisitor contentExtractVisitor = new ContentExtractVisitor();

        FileSystemItem firstFile = new File("2018-data.txt", 128);
        FileSystemItem secondFile = new File("2019-data.txt", 125);

        Folder firstFolder = new Folder("lightningData", 253);

        firstFolder.addFileSystemItem(firstFile);
        firstFolder.addFileSystemItem(secondFile);

        Folder secondFolder = new Folder("wrapper", 253);
        secondFolder.addFileSystemItem(firstFolder);

        //simple file
        System.out.println(firstFile.accept(contentExtractVisitor));

        //nested files structure
        System.out.println(secondFolder.accept(contentExtractVisitor));

        //visitor for list
        List<FileSystemItem> items = List.of(firstFile, secondFile, firstFolder, secondFolder);
        StringBuilder allContentBuilder = new StringBuilder();

        items.forEach(item -> allContentBuilder.append(item.accept(contentExtractVisitor)));
        System.out.println(allContentBuilder);
    }
}
