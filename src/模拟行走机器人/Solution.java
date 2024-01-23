package 模拟行走机器人;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[] dx={0,1,0,-1};
        int[] dy={1,0,-1,0};
        int res=0;
        int x=0,y=0,dir=0;//初始位置
        Set<String> s=new HashSet<>();
        for(int[] obs:obstacles){
            s.add(obs[0]+" "+obs[1]);
        }
        for(int com:commands){
            if(com==-2){
                dir=(dir+3)%4;
            }
            else if(com==-1){
                dir=(dir+1)%4;
            }
            else{
                for(int d=1;d<=com;d++){
                    if(s.contains((x+dx[dir])+" "+(y+dy[dir]))){
                        break;
                    }
                    x+=dx[dir];
                    y+=dy[dir];
                }
            }
            res=Math.max(res,x*x+y*y);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] commands={4,-1,4,-2,4};
        int[][] obstacles={{2, 4}};
        System.out.println(sol.robotSim(commands,obstacles));
    }
}
