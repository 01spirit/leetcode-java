package 打家劫舍;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] dp=new int[nums.length+1];
        dp[0]=0;
        dp[1]=nums[0];

        for(int i=2;i<=nums.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }

        return dp[nums.length];

    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={2,1,1,2};
        System.out.println(sol.rob(nums));
    }
}
