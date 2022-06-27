package patterns.builder;

import com.drew.imaging.FileType;

public class Main {
    public static void main(String[] args) {
        FileFilter.FileFilterBuilder filterBuilder = new FileFilter.FileFilterBuilder("myImage", 11.5)
                .type(FileType.Jpeg)
                .modified(false)
                .accessed(true);

        FileFilter fileFilter = filterBuilder.build();

        System.out.println("Name: " + fileFilter.getName() + "\n" +
                           "Size: " + fileFilter.getSize() + "\n" +
                           "Type: " + fileFilter.getType() + "\n" +
                           "Accessed: " + (fileFilter.isAccessed()? "Yes" : "No") + "\n" +
                           "Modified: " + (fileFilter.isModified()? "Yes" : "No") + "\n");
    }
}
