package Multithreadinf;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test3 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(66);
        for(int i = 0; i < 50; i++){
            executor.execute(new MyTask());
        }

        executor.shutdown();
    }
}

class MyTask implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " Child Thread");
    }
}
