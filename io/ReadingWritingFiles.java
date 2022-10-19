package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


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
            var writer = new BufferedWriter(new FileWriter(dest));
            String line = null;
            while((line = reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
                writer.close(); // close needed to solve data leak
            }
        }
    }
}
