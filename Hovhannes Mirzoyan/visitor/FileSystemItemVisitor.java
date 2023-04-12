package patterns.visitor;

import patterns.visitor.file.models.File;
import patterns.visitor.file.models.Folder;

public interface FileSystemItemVisitor {

     String visitFile(File file);

     String  visitFolder(Folder folder);
}
