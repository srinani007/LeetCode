package Array;

public class ArrayMax {
    public static int arrayMax(int[] A, int n){
        int currentMax = A[0];
        for(int i = 1; i < n; i++){
            if(A[i] > currentMax){
                currentMax = A[i];
            }
        }
        return currentMax;
    }
    public static void main(String[] args) {
        int[] A = {10, 15, 3, 5, 56, 107, 22, 16, 85};
        int n = A.length;
        for(int i = 0; i < n; i++) System.out.println("Array :"+ A[i]);
        System.out.println(".......");
        System.out.println("The maximum element is : "+ arrayMax(A, n)+ ".");
    }
}
