package 与对应负数同时存在的正整数;

import java.util.Arrays;

public class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]>0||nums[nums.length-1]<0||nums.length==1){
            return -1;
        }
        for(int left=0,right=nums.length-1;;){
            if(left==right){
                return -1;
            }
            else if(Math.abs(nums[left])==nums[right]){
                return Math.abs(nums[left]);
            }
            else if(Math.abs(nums[left])<nums[right]){
                right--;
            }
            else{
                left++;
            }
        }

    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={-10,10};
        System.out.println(sol.findMaxK(nums));

    }
}
