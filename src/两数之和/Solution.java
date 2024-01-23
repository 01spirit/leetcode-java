package 两数之和;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        Map<Integer,Integer> sum=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (!sum.containsKey(target-nums[i])) {
                sum.put(nums[i],i);
            }else{
                ans[0]=sum.get(target-nums[i]);
                ans[1]=i;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={3,3};
        int target= 6;
        System.out.println(Arrays.toString(sol.twoSum(nums,target)));
    }
}
