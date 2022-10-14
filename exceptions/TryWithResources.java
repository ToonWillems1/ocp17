package exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResources {
    public void readFile(String file){
        try( FileInputStream is = new FileInputStream("myfile.txt")){
            //read data file
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
