package concurrency;

public class BasicThreading {
    public static void main(String[] args) {
        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
           for (int i = 0; i < 3; i++) {
              System.out.println("Printing record: "+ i);
           }
        };
  
        System.out.println("Begin");
        new Thread(printInventory).start(); //using .run() instead will not initiate a new thread
        new Thread(printRecords).start();
        new Thread(printInventory).start(); 
        System.out.println("End");
     }
}
