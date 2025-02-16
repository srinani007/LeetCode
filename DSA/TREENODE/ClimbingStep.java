package TREENODE;
public class ClimbingStep {
    public int climbStairs(int n) {
        if (n == 1 || n == 2)
            return n;
        int a = 1, b = 2, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        ClimbingStep cs = new ClimbingStep();   
        System.out.println(cs.climbStairs(5));
        
    }
    
}
