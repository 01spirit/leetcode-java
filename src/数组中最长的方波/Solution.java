package 数组中最长的方波;

import java.util.Arrays;

public class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        int[] dp=new int[nums[nums.length-1]+1];
        int maxDP=-1;
        dp[nums[0]]=1;
        for(int i=0;i<nums.length;i++){
            double sqrt=Math.sqrt(nums[i]);
            if(sqrt%1==0){
                dp[nums[i]]=dp[(int)sqrt]+1;
                if(dp[nums[i]]>=2){
                    maxDP=Math.max(maxDP,dp[nums[i]]);
                }

            }
            else{
                dp[nums[i]]=1;
            }
        }
        return maxDP;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={4,3,6,16,8,2};
        System.out.println(sol.longestSquareStreak(nums));
    }
}
