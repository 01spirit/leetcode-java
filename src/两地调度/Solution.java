package 两地调度;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int totalCost=0;
        int totalCostB=0;
        int[] sub=new int[costs.length];
        for(int i=0;i<costs.length;i++){
            totalCostB+=costs[i][1];
            sub[i]=costs[i][0]-costs[i][1];
        }
        Arrays.sort(sub);
        totalCost+=totalCostB;
        for(int i=0;i< costs.length/2;i++){
            totalCost+=sub[i];
        }

        return totalCost;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[][] costs={{515, 563}, {451, 713}, {537, 709}, {343, 819}, {855, 779}, {457, 60}, {650, 359}, {631, 42}};
        System.out.println(sol.twoCitySchedCost(costs));
    }
}
