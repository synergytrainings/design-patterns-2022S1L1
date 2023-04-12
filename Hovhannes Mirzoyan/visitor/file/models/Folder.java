package patterns.visitor.file.models;

import patterns.visitor.FileSystemItemVisitor;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public class Folder extends FileSystemItem {

    private Set<FileSystemItem> fileSystemItems;

    public Folder(String name, double size) {
        super(name, size);
        this.fileSystemItems = new HashSet<>(16);
    }

    @Override
    public InputStream open() throws FileNotFoundException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String accept(FileSystemItemVisitor visitor) {
        return visitor.visitFolder(this);
    }

    @Override
    public boolean isFolder() {
        return true;
    }

    public Set<FileSystemItem> getFileSystemItems() {
        return fileSystemItems;
    }

    public void addFileSystemItem(FileSystemItem item) {
        checkIsItemExist(item);
        fileSystemItems.add(item);
    }

    private void checkIsItemExist(FileSystemItem item) {
        if (fileSystemItems.contains(item)) {
            throw new IllegalStateException("This file system already exists.");
        }
    }
}
