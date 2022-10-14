package exceptions;

import javax.management.RuntimeErrorException;

public class PrintException {
    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e + "\n");
            System.out.println(e.getMessage() + "\n");
            e.printStackTrace();
        }
    }

    private static void hop(){
        throw new RuntimeErrorException(null, "cannot hop");
    }

  
}

