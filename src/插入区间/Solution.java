package 插入区间;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res=new ArrayList<>();
        if(intervals.length==0){
            res.add(newInterval);
            return res.toArray(new int[res.size()][]);
        }

        int[][] tmp=new int[intervals.length+1][2];
        for(int i=0;i<intervals.length;i++){
            tmp[i]=intervals[i];
        }
        tmp[intervals.length]=newInterval;
        Arrays.sort(tmp,(a,b)->(a[0]-b[0]));

        int leftbound=tmp[0][0];
        int rightbound=tmp[0][1];

        for(int i=0;i<tmp.length;i++){
            if(tmp[i][0]<=rightbound){
                leftbound=Math.min(leftbound,tmp[i][0]);
                rightbound=Math.max(rightbound,tmp[i][1]);
            }
            else{
                res.add(new int[]{leftbound,rightbound});
                leftbound=tmp[i][0];
                rightbound=tmp[i][1];
            }
        }

        res.add(new int[]{leftbound,rightbound});
        return res.toArray(new int[res.size()][]);

        /*for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]<=rightbound){
                leftbound=Math.min(leftbound,intervals[i][0]);
                rightbound=Math.max(rightbound,intervals[i][1]);
            }
            else{
                res.add(new int[]{leftbound,rightbound});
                leftbound=intervals[i][0];
                rightbound=intervals[i][1];
            }
        }*/

    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        /*int[][] intervals={{1, 2},{
            3, 5
        },{
            6, 7
        },{
            8, 10
        },{
            12, 16
        }};
        int[] newIInterval={4,8};*/
        int[][] intervals={{1,5}};
        int[] newIInterval={0,0};
        int[][] num=sol.insert(intervals,newIInterval);
        for(int[] n:num){
            System.out.println(Arrays.toString(n));
        }
    }
}
