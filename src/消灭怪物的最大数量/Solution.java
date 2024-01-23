package 消灭怪物的最大数量;

import java.util.Arrays;

public class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int len=dist.length;
        int[] arriveTime=new int[len];
        for(int i=0;i<len;i++){
            arriveTime[i]=(dist[i]-1)/speed[i]+1;
        }
        Arrays.sort(arriveTime);
        for(int i=0;i<len;i++){
            if(arriveTime[i]<=i){
                return i;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] dist={1,1,2,3};
        int[] speed={1,1,1,1};
        System.out.println(sol.eliminateMaximum(dist,speed));
    }
}
