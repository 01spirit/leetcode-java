package 有效的数独;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        return isLegal(board);
    }

    public static boolean line(char[][] board){
        for(char[] lines:board){
            List<Character> nums=new ArrayList<>();
            for(int i=0;i<9;i++){
                char ch=lines[i];
                if(Character.isDigit(ch)){
                    if(!nums.contains(ch)){
                        nums.add(ch);
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean colum(char[][] board){
        for(int col=0;col<9;col++){
            List<Character> num=new ArrayList<>();
            for(int row=0;row<9;row++){
                char ch=board[row][col];
                if(Character.isDigit(ch)){
                    if(!num.contains(ch)){
                        num.add(ch);
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean square(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                List<Character> num=new ArrayList<>();
                for(int k=0;k<3;k++){
                    for(int l=0;l<3;l++){
                        int row=i*3+k;
                        int col=j*3+l;
                        char ch=board[row][col];
                        if(Character.isDigit(ch)){
                            if(!num.contains(ch)){
                                num.add(ch);
                            }
                            else{
                                return false;
                            }
                        }
                    }
                }

            }
        }
        return true;
    }

    public static boolean isLegal(char[][] board){
        return line(board)&&colum(board)&&square(board);
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        char[][] board= {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(sol.isValidSudoku(board));
    }
}
