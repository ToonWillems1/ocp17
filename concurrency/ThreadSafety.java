package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


public class ThreadSafety {
    //private volatile int sheepCount = 0;
    private AtomicInteger sheepCount = new AtomicInteger(0);
    private void incrementAndReport(){
        //System.out.print((++sheepCount) + " ");  //NOT THREAD SAFE! Use AtomicInteger to solve double number problem
        System.out.print(sheepCount.incrementAndGet() + " ");
    }
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            ThreadSafety manager = new ThreadSafety();
            for (int i = 0; i < 10; i++) {
                service.submit(() -> manager.incrementAndReport());
            } 
        } finally {
            service.shutdown();
        }
    }
}
