package AAATest1;

public class swapNumbers {
   public static void main(String[] args) {
    int a = 5;
    int b = 10;
    System.out.println("Before swapping: a = " + a + ", b = " + b);
    swapNumbers swap = new swapNumbers();
    swap.swap(a, b);
   } 
   public void swap(int a, int b){
    a = a + b;
    b = a - b;
    a = a - b;
    // After swapping, a and b will hold the swapped values
    System.out.println("After swapping: a = " + a + ", b = " + b);
   }
}
