package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test4 {
   public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(5);
    Future<String> future = executor.submit(new MyTask());
    try {
        System.out.println("Main Thread" + future.get());
    } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
    } finally {
        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS)) {
                executor.shutdownNow();
                if (!executor.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS))
                    System.err.println("Executor did not terminate");
            }
        } catch (InterruptedException ie) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
   } 
} 
class MyTask implements Callable<String>{
   public String call(){
      return Thread.currentThread().getName() + " Child Thread";
   }
}

    
