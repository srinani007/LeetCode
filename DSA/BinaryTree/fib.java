package BinaryTree;


public class fib {

    public static int climb(int n) {
        if (n == 0)
            return 1; // Reached the top
        if (n < 0)
            return 0; // Overstepped

        // Recursion: climb 1 or 2 steps
        return climb(n - 1) + climb(n - 2);

    }

    public static void main(String[] args) {

        // Example: Climbing 5 steps
        int n = 10; // Number of steps

        System.out.println("Total Ways: " + climb(n)); // Output: 3
    }

}
