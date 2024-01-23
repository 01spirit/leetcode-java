package 任意子数组和的绝对值的最大值;

public class Solution {
    public int maxAbsoluteSum(int[] nums) {
        /*int len=nums.length;
        int[] dp=new int[len];
        int maxAbs=0;
        if(len==0){
            return 0;
        }
        if(len==1){
            return Math.abs(nums[0]);
        }

        dp[0]=nums[0];
        maxAbs=Math.max(maxAbs,Math.abs(nums[0]));
        for(int i=1;i<len;i++){
            int sum=nums[i]+dp[i-1];
            int num=nums[i];
            if(Math.abs(num)>=Math.abs(sum)){
                dp[i]=num;
            }
            else{
                dp[i]=sum;
            }
//            System.out.println(nums[i]+"\t"+dp[i]);
            maxAbs=Math.max(maxAbs,Math.abs(dp[i]));
        }

        int[] p=new int[len];
        p[len-1]=nums[len-1];
        int maxAbs2=0;
        maxAbs2=Math.max(maxAbs2,Math.abs(nums[len-1]));
        for(int i=len-2;i>=0;i--){
            int sum=nums[i]+p[i+1];
            int num=nums[i];
            if(Math.abs(num)>=Math.abs(sum)){
                p[i]=num;
            }
            else{
                p[i]=sum;
            }
//            System.out.println(nums[i]+"\t"+dp[i]);
            maxAbs2=Math.max(maxAbs2,Math.abs(p[i]));
        }
        maxAbs=Math.max(maxAbs,maxAbs2);

        return maxAbs;*/

        int n = nums.length;
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) sum[i] = sum[i - 1] + nums[i - 1];
        int ans = 0;
        for (int i = 1, min = 0, max = 0; i <= n; i++) {
            ans = Math.max(ans, Math.abs(sum[i] - min));
            ans = Math.max(ans, Math.abs(sum[i] - max));
            max = Math.max(max, sum[i]);
            min = Math.min(min, sum[i]);
        }
        return ans;


    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={-7,-1,0,-2,1,3,8,-2,-6,-1,-10,-6,-6,8,-4,-9,-4,1,4,-9};//2,-5,1,-4,3,-2
        System.out.println(sol.maxAbsoluteSum(nums));
    }
}
