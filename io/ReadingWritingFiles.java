package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class ReadingWritingFiles {
    void copyStream(InputStream in, OutputStream out) throws IOException{
        int batchSize = 1024;
        var buffer = new byte[batchSize];
        int lengthRead;
        while ((lengthRead = in.read(buffer, 0, batchSize)) > 0) {
           out.write(buffer, 0, lengthRead);
           out.flush();
        }
    }

    void copyTextFile(File src, File dest) throws IOException {
        try (var reader = new BufferedReader(new FileReader(src))){
            var writer = new PrintWriter(new FileWriter(dest));
            String line = null;
            while((line = reader.readLine()) != null){
                writer.println(line);
                writer.close(); // close needed to solve data leak
            }
        }
    }

    void copyPathAsString(Path input, Path output) throws IOException{
        String string = Files.readString(input);
        Files.writeString(output, string);
    }

    void copyPathAsBytes(Path input, Path output) throws IOException {
        byte[] bytes = Files.readAllBytes(input);
        Files.write(output, bytes);
    }

    void copyPathAsLines(Path input, Path output) throws IOException {
        List<String> lines = Files.readAllLines(input);
        Files.write(output, lines);
    }
    //possible OutOfMemoryError with the above three methods, solution below
    void readLazily(Path path) throws IOException {
        try(var s = Files.lines(path)){
            s.filter(f -> f.startsWith("WARN:"))
                .map(f -> f.substring(5))
                .forEach(System.out::println);
        }        
    }
}
