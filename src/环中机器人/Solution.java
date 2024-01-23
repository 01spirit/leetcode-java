package 环中机器人;

public class Solution {
    public boolean isRobotBounded(String instructions){
        int[][] direct={{0, 1},{-1,0},{0,-1},{1,0}};//按逆时针顺序列出，四进制循环
        int x=0,y=0;
        int index=0;
        int len=instructions.length();

        for(int i=0;i<len;i++){
            char ch=instructions.charAt(i);
//            System.out.println(ch);
            if('G'==ch){
                x+=direct[index][0];
                y+=direct[index][1];
//                System.out.println(x);
            }
            else if('L'==ch){
                index+=1;//左转对应数组中的后一位
                index%=4;//四进制循环
            }
            else{
                index+=3;//右转对应数组中的后面第三位，循环
                index%=4;
            }
        }
        return (x==0&&y==0)||index!=0;
    }

    public static void main(String[] args) {
        String instruction="RGGGLGLLLLGLRGRLGGRLLRRRL";
        Solution sol=new Solution();

        System.out.println(sol.isRobotBounded(instruction));
    }
}
