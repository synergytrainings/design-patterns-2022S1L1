package patterns.visitor.file.models;


import patterns.visitor.FileSystemItemVisitor;

import java.io.FileNotFoundException;
import java.io.InputStream;

public abstract class FileSystemItem {

    private String name;

    private double size;

    public FileSystemItem(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public abstract InputStream open() throws FileNotFoundException;

    public abstract String accept(FileSystemItemVisitor visitor);

    public abstract boolean isFolder();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
