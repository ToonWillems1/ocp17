package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class ThreadSafety {
    private int sheepCount = 0;
    private final Object herd = new Object();
    private void incrementAndReport(){
        synchronized(herd){
            System.out.print((++sheepCount) + " ");
        }
    }
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            ThreadSafety manager = new ThreadSafety();
            for (int i = 0; i < 10; i++) {
                synchronized(manager){
                    service.submit(() -> manager.incrementAndReport());
                }
            } 
        } finally {
            service.shutdown();
        }
    }
}
