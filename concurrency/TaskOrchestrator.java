package concurrency;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;

public class TaskOrchestrator{
   private void removeLions(){System.out.println("Removing Swakke");}
   private void cleanPen(){System.out.println("Pen is clean");}
   private void addLions(){System.out.println("Swakke toegevoegd");}
   public void performTask(CyclicBarrier c1, CyclicBarrier c2){
      try {
         removeLions();
         c1.await();
         cleanPen();
         c2.await();
         addLions();
      } catch (InterruptedException | BrokenBarrierException e) {
         // exception handeled
      }
   }
   public static void main(String[] args) {
      var service = Executors.newFixedThreadPool(4);

      try {
         var manager = new TaskOrchestrator();
         var c1 = new CyclicBarrier(4);
         var c2 = new CyclicBarrier(4,
            () -> System.out.println("*** Pen clean!"));
         for (int i = 0; i < 4; i++) 
            service.submit(() -> manager.performTask(c1,c2));
         }finally{
            service.shutdown();
         }
      }
   }
