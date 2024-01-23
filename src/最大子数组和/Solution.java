package 最大子数组和;

public class Solution {
    public int maxSubArray(int[] nums) {
        int pre=0;
        int maxRes=nums[0];

        for(int i : nums){
            pre=Math.max(pre+i,i);//前面的子数组的结果加上第i个数，若结果小于这个数，从这个数开始重新求和
            maxRes=Math.max(pre,maxRes);//最大结果是已求得的结果和刚得到的结果的最大值
        }
        return maxRes;
    }

    public static void main(String[] args){
        Solution sol=new Solution();
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};

        System.out.print(sol.maxSubArray(nums));
    }
}
