package 既不是最小值也不是最大值;

public class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3){
            return -1;
        }
        return Math.max(Math.min(nums[0],nums[1]),Math.min(Math.max(nums[0],nums[1]),nums[2]));
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={5,4,6};
        System.out.println(sol.findNonMinOrMax(nums));
    }
}
