package ASensor;

import java.io.*;
import java.util.*;

public class SensorAnalysis {

    // Directions for moving up, down, left, and right
    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private static int N;  // Grid size
    private static int[][] grid;  // Sensor data grid
    private static boolean[][] visited;  // Visited cells for the DFS/BFS

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("ASensor/sensor2.txt"));
        N = Integer.parseInt(br.readLine());
        grid = new int[N][N];

        // Reading the sensor grid
        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(row[j]);
            }
        }

        // Find the largest contiguous region with the same status
        visited = new boolean[N][N];
        int maxSameStatusRegion = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    maxSameStatusRegion = Math.max(maxSameStatusRegion, dfsSingleStatus(i, j, grid[i][j]));
                }
            }
        }

        // Find the largest contiguous region with two different statuses
        visited = new boolean[N][N];  // Reset visited for two-status check
        int maxTwoStatusRegion = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    maxTwoStatusRegion = Math.max(maxTwoStatusRegion, dfsTwoStatuses(i, j));
                }
            }
        }

        // Output the results to the file
        PrintWriter out = new PrintWriter("sensor2out.txt");
        out.println(maxSameStatusRegion);
        out.println(maxTwoStatusRegion);
        out.close();
    }

    // DFS to find the largest contiguous region with a single status
    private static int dfsSingleStatus(int i, int j, int status) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});
        visited[i][j] = true;
        int size = 0;

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int x = current[0], y = current[1];
            size++;

            for (int[] direction : DIRECTIONS) {
                int nx = x + direction[0], ny = y + direction[1];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny] && grid[nx][ny] == status) {
                    visited[nx][ny] = true;
                    stack.push(new int[]{nx, ny});
                }
            }
        }

        return size;
    }

    // DFS to find the largest contiguous region with two statuses
    private static int dfsTwoStatuses(int i, int j) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});
        visited[i][j] = true;
        Set<Integer> statusSet = new HashSet<>();
        statusSet.add(grid[i][j]);
        int size = 0;

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int x = current[0], y = current[1];
            size++;

            for (int[] direction : DIRECTIONS) {
                int nx = x + direction[0], ny = y + direction[1];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny]) {
                    int neighborStatus = grid[nx][ny];
                    statusSet.add(neighborStatus);

                    // We are only interested in regions with exactly two distinct statuses
                    if (statusSet.size() <= 2) {
                        visited[nx][ny] = true;
                        stack.push(new int[]{nx, ny});
                    }
                }
            }
        }

        // If the region has exactly two statuses, return its size
        return statusSet.size() == 2 ? size : 0;
    }
}
