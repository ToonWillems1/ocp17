package concurrency;

public class ThreadSleep {
    public static void pause(){
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {}
        System.out.println("Thread finished!"); //notice the time it takes before this method is printed
        
    }
    public static void main(String[] unused) {
        var job = new Thread(() -> pause());

        job.start();  //.setDaemon(true) would never print the thread finished statement
        System.out.println("Main method finished!");
    }
}
