package ASensor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SensorPOIDetector {

    public static void main(String[] args) {
        try {
            File file = new File("/Users/prashanthkunchanapalli/LeetCode/LeetCode/ASensor/sensor1.txt");
            Scanner sc = new Scanner(file);

            int N = sc.nextInt();  
            char[][] grid = new char[N][N];

            for (int i = 0; i < N; i++) {
                grid[i] = sc.next().toCharArray();
            }

            int poiCount = findPOIs(grid, N);
            System.out.println(poiCount);

            sc.close(); 

        } catch (FileNotFoundException e) {
            System.out.println("File not found: sensor1.txt");
            e.printStackTrace();
        }
    }


    public static int findPOIs(char[][] grid, int N) {
        int poiCount = 0;

        for (int x1 = 0; x1 < N; x1++) {
            for (int y1 = 0; y1 < N; y1++) {
                for (int x2 = x1; x2 < N; x2++) {
                    for (int y2 = y1; y2 < N; y2++) {
                        if (isPOI(grid, x1, y1, x2, y2)) {
                            poiCount++;
                        }
                    }
                }
            }
        }

        return poiCount;
    }

    private static boolean isPOI(char[][] grid, int x1, int y1, int x2, int y2) {
        Set<Character> uniqueColors = new HashSet<>();
        Map<Character, Integer> regionCount = new HashMap<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                uniqueColors.add(grid[i][j]);
            }
        }

        if (uniqueColors.size() != 2) {
            return false;
        }

        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                char color = grid[i][j];
                if (!visited[i][j]) {
                    dfs(grid, visited, i, j, x1, y1, x2, y2, color);
                    regionCount.put(color, regionCount.getOrDefault(color, 0) + 1);
                }
            }
        }

        boolean foundOneRegion = false, foundMultipleRegions = false;
        for (char color : uniqueColors) {
            int regions = regionCount.get(color);
            if (regions == 1) {
                foundOneRegion = true;
            } else if (regions >= 2) {
                foundMultipleRegions = true;
            }
        }

        return foundOneRegion && foundMultipleRegions;
    }

    private static void dfs(char[][] grid, boolean[][] visited, int i, int j, int x1, int y1, int x2, int y2, char color) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});
        visited[i][j] = true;

        while (!stack.isEmpty()) {
            int[] cell = stack.pop();
            int x = cell[0];
            int y = cell[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >= x1 && nx <= x2 && ny >= y1 && ny <= y2 && !visited[nx][ny] && grid[nx][ny] == color) {
                    visited[nx][ny] = true;
                    stack.push(new int[]{nx, ny});
                }
            }
        }
    }
}

