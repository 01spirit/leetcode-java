package 数组中两元素的最大成绩;

import java.util.Arrays;

public class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={3,4,5,2};
        System.out.println(sol.maxProduct(nums));
    }
}
