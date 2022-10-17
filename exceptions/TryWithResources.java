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

/* THE ABOVE CODE DOES THE SAME AS CODE BELOW
 * 
 * public void readFile(String file){
 *    FileInputStream is = null;
 *    try{
 *       is = new FileInputStream("myfile.txt");
 *       //read data file 
 *    } catch(IOException e){
 *       e.printStackTrace();
 *    } finally {
 *       if(is != null){
 *          try {
 *              is.close();
 *          } catch(IOException e2) {
 *              e2.printStackTrace();
 *          }
 *       }
 *    }
 * }
 */
