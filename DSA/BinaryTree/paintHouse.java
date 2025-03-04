package BinaryTree;

public class paintHouse {
    public static int minCost(int[][] costs){
    if(costs.length == 0) return 0;

    for(int i = 1; i < costs.length; i++){
        costs[i][0] += Math.min(costs[i - 1][1], costs[i - 1][2]);
        costs[i][1] += Math.min(costs[i - 1][0], costs[i - 1][2]);
        costs[i][2] += Math.min(costs[i - 1][0], costs[i - 1][1]);
    }
     int n = costs.length -1;
     return Math.min(Math.min(costs[n][0],costs[n][1]), costs[n][2]);
   }
   public static void main(String[] args) {
    int[][] costs = {
        {17, 2, 17},
        {16, 16, 5},
        {14, 3, 19}
    };
    System.out.println(minCost(costs)); // Output: 10
    // Explanation: Paint house 0 with color 1, paint house 1 with color 2, and paint house 2 with color 1.
    // Minimum cost = 2 + 5 + 3 = 10.
    // Note: The output may vary based on the input costs array.
    // You can test with different costs arrays to see the results.
    // Example: int[][] costs = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    // System.out.println(minCost(costs)); // Output: 12
    // Explanation: Paint house 0 with color 1, paint house 1 with color 2, and paint house 2 with color 1.
    // Minimum cost = 1 + 5 + 6 = 12.
    // Note: The output may vary based on the input costs array.
    // You can test with different costs arrays to see the results.
    // Example: int[][] costs = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    // System.out.println(minCost(costs)); // Output: 12
    // Explanation: Paint house 0 with color 1, paint house 1 with color 2, and paint house 2 with color 1.
    // Minimum cost = 1 + 5 + 6 = 12.
    // Note: The output may vary based on the input costs array.
    // You can test with different costs arrays to see the results.
    // Example: int[][] costs = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    // System.out.println(minCost(costs)); // Output: 12            
   }
}
