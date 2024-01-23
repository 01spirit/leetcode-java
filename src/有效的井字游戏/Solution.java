package 有效的井字游戏;

public class Solution {
    public boolean validTicTacToe(String[] board) {
        int xCount=0;
        int oCount=0;
        for(String row:board){
            for(char ch:row.toCharArray()){
                xCount=(ch=='X')?(xCount+1):xCount;
                oCount=(ch=='O')?(oCount+1):oCount;
            }
        }

        //排除错误结果

        //后手棋子多于先手 或 先手棋子比后手多一个以上
        if(oCount>xCount||xCount-oCount>1){
            return false;
        }

        //先后手棋子相等 且 先手获胜 或 先手棋子多一个 且 后手获胜
        if(xCount-oCount!=1&&win(board,'X')
                ||oCount!=xCount&&win(board,'O')){
            return false;
        }


        return true;
    }

    public boolean win(String[] board,char p){
        //判断行和列
        for(int i=0;i<3;i++){
            if(p==board[i].charAt(0)&&p==board[i].charAt(1)&&p==board[i].charAt(2)
                ||p==board[0].charAt(i)&&p==board[1].charAt(i)&&p==board[2].charAt(i)){
                return true;
            }
        }
        //判断对角线
        if(p==board[0].charAt(0)&&p==board[1].charAt(1)&&p==board[2].charAt(2)
                ||p==board[0].charAt(2)&&p==board[1].charAt(1)&&p==board[2].charAt(0)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String[] board={"XOX"," X ","   "};
        System.out.println(sol.validTicTacToe(board));
    }
}
