package BST;

public class NQueens {
    public static void main(String[] args) {
        int n = 8; // Change board size here
        solveNQueens(n);
    }

    public static void solveNQueens(int n) {
        char[][] board = new char[n][n];
        boolean[] cols = new boolean[n];          // Tracks attacked columns
        boolean[] leftDiag = new boolean[2 * n]; // Tracks attacked left diagonals
        boolean[] rightDiag = new boolean[2 * n];// Tracks attacked right diagonals
        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        // Start solving the problem
        backtrack(board, 0, n, cols, leftDiag, rightDiag);
    }

    private static void backtrack(char[][] board, int row, int n, boolean[] cols, boolean[] leftDiag, boolean[] rightDiag) {
        if (row == n) {
            printCompactBoard(board);
            return;
        }

        for (int col = 0; col < n; col++) {
            int leftIndex = row - col + n;   // Map left diagonal to array index
            int rightIndex = row + col;     // Map right diagonal to array index

            // Check if placing a queen here is safe
            if (cols[col] || leftDiag[leftIndex] || rightDiag[rightIndex]) {
                continue;
            }

            // Place the queen
            board[row][col] = 'Q';
            cols[col] = true;
            leftDiag[leftIndex] = true;
            rightDiag[rightIndex] = true;

            // Recurse to the next row
            backtrack(board, row + 1, n, cols, leftDiag, rightDiag);

            // Backtrack: Remove the queen
            board[row][col] = '.';
            cols[col] = false;
            leftDiag[leftIndex] = false;
            rightDiag[rightIndex] = false;
        }
    }

    private static void printCompactBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println(); // Separate solutions with a blank line
    }
}
