package 合并区间;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int leftBound=intervals[0][0],rightBound=intervals[0][1];
        ArrayList<int[]> res=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=rightBound){
                leftBound=Math.min(leftBound,intervals[i][0]);
                rightBound=Math.max(rightBound,intervals[i][1]);
            }
            else{
                int[] bound= {leftBound, rightBound};
                res.add(bound);
                leftBound=intervals[i][0];
                rightBound=intervals[i][1];
            }
        }
        int[] bound= {leftBound, rightBound};
        res.add(bound);
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[][] intervals={{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] res=sol.merge(intervals);
        for(int[] r:res){
            System.out.println(Arrays.toString(r));
        }
    }
}
