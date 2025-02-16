package Multithreadinf;


    class Mythread implements Runnable{
        public void run(){
            for (int i = 0; i < 2; i++){
                System.out.println(Thread.currentThread().getName()+"Child Thread");
            }
        }
    }
public class test2{    
    public static void main(String[] args) {
        Thread t = new Thread(new Mythread());
        Thread t1 = new Thread(new Mythread());
        t.start();
        t1.start();
    
    }
}
