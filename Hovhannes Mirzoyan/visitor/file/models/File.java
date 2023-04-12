package patterns.visitor.file.models;

import patterns.visitor.FileSystemItemVisitor;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class File extends FileSystemItem {

    public File(String name, double size) {
        super(name, size);
    }

    @Override
    public InputStream open() throws FileNotFoundException {
        return new BufferedInputStream(new FileInputStream(getName()));
    }

    @Override
    public void close() {

    }

    @Override
    public String accept(FileSystemItemVisitor visitor) {
        return visitor.visitFile(this);
    }

    @Override
    public boolean isFolder() {
        return false;
    }

}
