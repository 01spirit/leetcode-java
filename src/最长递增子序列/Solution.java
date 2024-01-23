package 最长递增子序列;

public class Solution {
    public int lengthOfLIS(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int[] dp=new int[nums.length];
        int maxLength=1;
        dp[0]=1;
        for(int i=1;i< nums.length;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            maxLength=Math.max(maxLength,dp[i]);

        }
        return maxLength;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={10,9,2,5,3,7,101,18};
        System.out.println(sol.lengthOfLIS(nums));
    }
}
