package SUDOKO;

public class neWvalidateSudokoCode {

    public static final int N = 4;
    public static void main(String[] args) {
        int[][] board = {
            {1, 2, 3, 4},
            {3, 4, 1, 2},
            {4, 1, 2, 3},
            {2, 0, 4, 1}
        };
    

        if (isValidSudoku(board)) {
            System.out.println("Is a valid Sudoko"); 
        } else {
            System.out.println("Is not a valid Sudoko");
        }
        
    }
                
        private static boolean isValidSudoku(int[][] board) {
            return isValidRows(board) && isValidCols(board) && isValidBoxes(board);
        }
              
        private static boolean isValidRows(int[][] board) {
            for(int i = 0; i < N; i++){
                boolean[] seen = new boolean[N+1];
                for(int j = 0; j < N; j++){
                    if (seen[board[i][j]]) return false;
                    seen[board[i][j]] = true;
                }
            }
            return true;
        }
        private static boolean isValidCols(int[][] board) {
            for(int j = 0; j < N; j++){
                boolean[] seen = new boolean[N+1];
                for(int i = 0; i < N; i++){
                    if (seen[board[i][j]]) return false;
                    seen[board[i][j]] = true;
                }
            }
            return true;
        }
        
    private static boolean isValidBoxes(int[][] board) {
        for (int row = 0; row < N; row += 2) {
            for (int col = 0; col < N; col += 2) {                    boolean[] seen = new boolean[N+1];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        int num = board[row + i][col + j];
                        if (seen[num]) return false;
                        seen[num] = true;
                    }
                }
            }
        }
        return true;
    }    
}
