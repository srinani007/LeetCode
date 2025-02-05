package SUDOKO;

public class CodeSudoko {
    public static void solveSudoku(int[][] board) {
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] board = {
            {1, 2, 3, 4},
            {3, 4, 1, 2},
            {4, 1, 2, 3},
            {2, 3, 4, 1}
        };
        solveSudoku(board);
   } 
}
