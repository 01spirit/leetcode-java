package 打家劫舍II;

import java.util.Arrays;

public class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }

        /*int[] dp=new int[n];
        dp[0]=0;
        dp[1]=nums[0];

        *//*for(int i=2;i<=n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }*//*

        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }

        int[] tp=new int[n];
        tp[n-1]=0;
        tp[n-2]=nums[n-1];
        for(int i=n-2;i>0;i--){
            tp[i-1]=Math.max(tp[i],tp[i+1]+nums[i]);
        }

//        System.out.println(Arrays.toString(tp));

        int res=Math.max(dp[n-1],tp[0]);*/

        int res=0;
        int frontOnly=findMax(nums,0,n-2);
        int tailOnly=findMax(nums,1,n-1);
        res=Math.max(frontOnly,tailOnly);

        return res;
    }


    public int findMax(int[] nums,int start,int end){
        int cur=nums[start],res=Math.max(nums[start],nums[start+1]);
        for(int i=start+2;i<=end;i++){
            int tmp=res;
            res=Math.max(res,cur+nums[i]);
            cur=tmp;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={1,2,3,4,5,6};
        System.out.println(sol.rob(nums));
    }
}
