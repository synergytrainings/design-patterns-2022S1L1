package patterns.visitor;

import patterns.visitor.file.models.File;
import patterns.visitor.file.models.Folder;

public interface FileSystemItemVisitor {

    String visit(File file);

    String visit(Folder folder);

}

