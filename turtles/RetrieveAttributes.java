package turtles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;


public class RetrieveAttributes {
    public static void main(String[] args) {
        var path = Paths.get("turtles/sea.txt");
      
      try {
         BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
         System.out.println("Is a directory? " + data.isDirectory());
         System.out.println("Is a regular file? " + data.isRegularFile());
         System.out.println("Size (in bytes): " + data.size());
         System.out.println("Last modified: " + data.lastModifiedTime());
      } catch (IOException e) {
         System.out.println("File not found");
      }
    }
}
