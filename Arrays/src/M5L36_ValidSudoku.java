import java.util.*;
public class M5L36_ValidSudoku {

    public static boolean checkSubBox(char[][] board, int i , int j){

        // Optimal approach seperate check box logic and recurssion
        // recursion is not needed
        Set<Character> set = new HashSet<>();
        for(int p = i; p < i + 3; p++){

            for(int q = j; q < j+3; q++){
                char ch = board[p][q];
                if(ch != '.' && !set.add(ch)) return false;
            }
        }

        return true;
    }

    public static boolean isValidSudoku(char[][] board) {

        Set<Character> set = new HashSet<>();

        // Check 1: first iterate over every row and check if unique vals are present

        for(int row = 0 ; row < 9; row++){

            if(!set.isEmpty()) set.clear();
            for(int col = 0 ; col < 9; col ++){

                char ch = board[row][col];
                //System.out.print(ch + " ");
                if(ch != '.' && !set.add(ch)) return false;
            }

        }

        // Check 2:  now iterate on every col and check if unique
        System.out.println();
        for(int col = 0 ; col < 9; col++){

            if(!set.isEmpty()) set.clear();
            for( int row = 0; row < 9; row++){

                char ch = board[row][col];
                //System.out.print(ch + " ");
                if(ch != '.' && !set.add(ch)) return false;
            }
        }

        // Check 3:  we need to check if in every 3 x 3 sub-boxes if the vals are unique
        System.out.println();
        for(int row = 0; row < 9; row += 3){
            for(int col = 0; col < 9; col+= 3){
                if(!checkSubBox(board,row,col)) return false;
            }
        }

        // if all checks are passed then i.e Valid Sudoku!
        return true;


    }

    public static void main(String[] args) {

        char[][] boardValid = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] boardInvalid = {
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        };
        System.out.println(isValidSudoku(boardValid));

    }
}
