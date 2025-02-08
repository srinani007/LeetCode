package DynamicProgramming;

import java.util.Arrays;

public class uniqueP{
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[j]+= dp[j - 1];
            }
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        uniqueP obj = new uniqueP();
        System.out.println(obj.uniquePaths(3, 7));
    }
}
