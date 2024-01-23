package 最大子序列交替和;

public class Solution {
    public long maxAlternatingSum(int[] nums) {
        long even=nums[0],odd=0;
        for(int i=0;i< nums.length;i++){
            even=Math.max(even,odd+nums[i]);
            odd=Math.max(odd,even-nums[i]);
        }
        return even;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={4,2,5,3};
        System.out.println(sol.maxAlternatingSum(nums));
    }
}
