package SUDOKO;

public class validateSudokoCode {
   public static final int N = 4;
   
   public static boolean isSafe(int board[][], int row, int col, int num) {
        for (int x = 0; x <= 3; x++)
            if (board[row][x] == num)
                return false;
        for (int x = 0; x <= 3; x++)
            if (board[x][col] == num)
                return false;
        int startRow = row - row % 2, startCol = col - col % 2;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                if (board[i + startRow][j + startCol] == num)
                    return false;
        return true;
    }
    public static boolean solveSudoku(int board[][], int n) {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }
        if (isEmpty) {
            return true;
        }
        for (int num = 1; num <= n; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;
                if (solveSudoku(board, n)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    public static void print(int board[][], int N) {
        for (int r = 0; r < N; r++) {
            for (int d = 0; d < N; d++) {
                System.out.print(board[r][d]);
                System.out.print(" ");
            }
            System.out.print("\n");
            if ((r + 1) % (int) Math.sqrt(N) == 0) {
                System.out.print("");
            }
        }
    }
    public static void printSudoku(int board[][]) {
        int N = board.length;
        print(board, N);
    }
    public static void main(String[] args) {
        int board[][] = { { 1, 0, 3, 0 }, { 0, 0, 2, 1 }, { 0, 1, 0, 2 }, { 2, 4, 0, 0 } };
        int N = board.length;
        if (solveSudoku(board, N)) {
            printSudoku(board);
        } else {
            System.out.println("No solution");
        }
    }
}
