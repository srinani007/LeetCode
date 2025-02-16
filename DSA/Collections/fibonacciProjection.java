package Collections;

public class fibonacciProjection {
   public static void main(String[] args) {
    int n = 3;
    fibonacciProjection obj = new fibonacciProjection();
    System.out.println(obj.fib(n));
   } 
   public int fib(int n) {
    if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
   }
}
