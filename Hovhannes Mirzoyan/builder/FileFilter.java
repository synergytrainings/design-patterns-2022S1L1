package patterns.builder;

import com.drew.imaging.FileType;

public class FileFilter {
    private final String name;

    private final Double size;

    private final FileType type;

    private final Boolean accessed;

    private final Boolean modified;

    public String getName() {
        return name;
    }

    public Double getSize() {
        return size;
    }

    public FileType getType() {
        return type;
    }

    public Boolean isAccessed() {
        return accessed;
    }

    public Boolean isModified() {
        return modified;
    }

    private FileFilter(FileFilterBuilder filterBuilder){
        this.name = filterBuilder.name;
        this.size = filterBuilder.size;
        this.type = filterBuilder.type;
        this.accessed = filterBuilder.accessed;
        this.modified = filterBuilder.modified;
    }

    public static class FileFilterBuilder{
        private final String name;

        private final Double size;

        private FileType type;

        private Boolean accessed;

        private Boolean modified;

        public FileFilterBuilder(String name, Double size){
            this.name = name;
            this.size = size;
        }

        public FileFilterBuilder type(FileType type){
            this.type = type;
            return this;
        }

        public FileFilterBuilder accessed(Boolean accessed){
            this.accessed = accessed;
            return this;
        }

        public FileFilterBuilder modified(Boolean modified){
            this.modified = modified;
            return this;
        }

        public FileFilter build(){
            return new FileFilter(this);
        }
    }

}
