package 数组中重复的数字;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> count=new HashMap<Integer,Integer>();

        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:count.entrySet()){
            if(entry.getValue()>1){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={2, 3, 1, 0, 2, 5, 3};
        System.out.println(sol.findRepeatNumber(nums));
    }
}

