package TREENODE;
public class ClimblingStep2 {
    public int climbStairs(int n) {
        if (n == 1 || n == 2) return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    public static void main(String[] args) {
        ClimblingStep2 cs = new ClimblingStep2();
        System.out.println(cs.climbStairs(5));
    }
}
