package Collections;

public class startPrin {
   public static void main(String[] args) {
        int rows = 5, n = 0;
        for (int i = 1; i <= rows ; ++i, n = 0) {
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print(" ");
            }
            while (n != 2 * i - 1) {
                System.out.print("*");
                ++n;
            } 
            System.out.println();

        }

    }
}
