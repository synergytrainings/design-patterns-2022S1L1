package patterns.factory;

import java.nio.file.Path;

public class Document {
     private Path path;

     private double size;


     public Document(Path path, double size) {
          this.path = path;
          this.size = size;
     }

     public Path getPath() {
          return path;
     }

     public void setPath(Path path) {
          this.path = path;
     }


     public double getSize() {
          return size;
     }

     public void setSize(double size) {
          this.size = size;
     }
}
