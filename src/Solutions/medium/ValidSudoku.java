package Solutions.medium;

import java.util.Arrays;

public class ValidSudoku {
    /*
    Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

    Each row must contain the digits 1-9 without repetition.
    Each column must contain the digits 1-9 without repetition.
    Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
     */

    public static void main(String[] args) {
        char[][] check = new char[][]{
                {'.','4','.','.','.','.','.','.','.'},
                {'.','.','4','.','.','.','.','.','.'},
                {'.','.','.','1','.','.','7','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','3','.','.','.','6','.'},
                {'.','.','.','.','.','6','.','9','.'},
                {'.','.','.','.','1','.','.','.','.'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','8','.','.','.','.','.'}
        };
        System.out.println(isValidSudoku(check));
    }

    public static boolean isValidSudoku(char[][] board) {
        int[] freq = new int[9];
        Arrays.fill(freq, 1);

        //check horizontal
        for(int i=0;i<board.length;i++) {
            for (int j = 0; j < board.length; j++) {
                if (Character.isDigit(board[i][j])) {
                    if (freq[Character.getNumericValue(board[i][j]) - 1] == 0)
                        return false;
                    freq[Character.getNumericValue(board[i][j]) - 1]--;
                }
            }
            Arrays.fill(freq, 1);
        }

        //check vertical
        for(int i=0;i<board.length;i++) {
            for (int j = 0; j < board.length; j++) {
                if (Character.isDigit(board[j][i])) {
                    if (freq[Character.getNumericValue(board[j][i]-1)] == 0)
                        return false;
                    freq[Character.getNumericValue(board[j][i])-1]--;
                }
            }
            Arrays.fill(freq, 1);
        }

        //check square
        boolean flag = false;
        for(int i=0;i< board.length;i++) {
            for(int j=0;j<board.length;j++){
                flag = isValidBox(board,i-i%3,j-j%3);
                if(!flag)
                    return false;
           }

        }
        return flag;
    }

    public static boolean isValidBox(char[][] board, int row, int col){
        int[] freq = new int[9];
        Arrays.fill(freq, 1);
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++){
                if (Character.isDigit(board[i+row][j+col])) {
                    if (freq[Character.getNumericValue(board[i+row][j+col]-1)] == 0)
                        return false;
                    freq[Character.getNumericValue(board[i+row][j+col])-1]--;
                }
            }
        return true;
    }
}
