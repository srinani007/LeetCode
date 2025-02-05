package SUDOKO;

public class SudokuSolver {
    private static final int N = 4;
    private static final int SUBGRID_SIZE = 2;

    public static void main(String[] args) {
        int[][] board = {
            {0, 2, 3, 0},
            {3, 0, 0, 1},
            {1, 0, 0, 4},
            {0, 4, 2, 0}
        };

        System.out.println("Original Sudoku:");
        printBoard(board);

        if (!isValidSudoku(board)) {
            System.out.println("❌ Invalid Sudoku: The initial board has duplicate numbers.");
            return;
        }

        if (solveSudoku(board)) {
            System.out.println("✅ Sudoku Solved:");
            printBoard(board);
        } else {
            System.out.println("❌ No solution found! The board might be unsolvable.");
        }
    }

    private static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= N; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num; // Try placing the number
                            if (solveSudoku(board)) {
                                return true; // If successful, return true
                            }
                            board[row][col] = 0; // Undo choice (backtrack)
                        }
                    }
                    return false; // No number works, backtrack
                }
            }
        }
        return true; // Sudoku solved!
    }

    private static boolean isValid(int[][] board, int row, int col, int num) {
        // Check row and column
        for (int i = 0; i < N; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }
        // Check subgrid
        int startRow = (row / SUBGRID_SIZE) * SUBGRID_SIZE;
        int startCol = (col / SUBGRID_SIZE) * SUBGRID_SIZE;

        for (int i = 0; i < SUBGRID_SIZE; i++) {
            for (int j = 0; j < SUBGRID_SIZE; j++) {
                if (board[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValidSudoku(int[][] board) {
        // Check rows and columns
        for (int i = 0; i < N; i++) {
            boolean[] rowCheck = new boolean[N + 1];
            boolean[] colCheck = new boolean[N + 1];

            for (int j = 0; j < N; j++) {
                if (board[i][j] != 0) {
                    if (rowCheck[board[i][j]]) {
                        System.out.println("⚠️ Duplicate found in row " + i);
                        return false;
                    }
                    rowCheck[board[i][j]] = true;
                }
                if (board[j][i] != 0) {
                    if (colCheck[board[j][i]]) {
                        System.out.println("⚠️ Duplicate found in column " + i);
                        return false;
                    }
                    colCheck[board[j][i]] = true;
                }
            }
        }

        // Check subgrids
        for (int row = 0; row < N; row += SUBGRID_SIZE) {
            for (int col = 0; col < N; col += SUBGRID_SIZE) {
                if (!isValidSubgrid(board, row, col)) return false;
            }
        }
        return true;
    }

    private static boolean isValidSubgrid(int[][] board, int startRow, int startCol) {
        boolean[] seen = new boolean[N + 1];

        for (int i = 0; i < SUBGRID_SIZE; i++) {
            for (int j = 0; j < SUBGRID_SIZE; j++) {
                int num = board[startRow + i][startCol + j];
                if (num != 0) {
                    if (seen[num]) {
                        System.out.println("⚠️ Duplicate found in subgrid at (" + startRow + ", " + startCol + ")");
                        return false;
                    }
                    seen[num] = true;
                }
            }
        }
        return true;
    }

    private static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}