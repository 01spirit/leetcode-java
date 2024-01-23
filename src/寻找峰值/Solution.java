package 寻找峰值;

public class Solution {
    public int findPeakElement(int[] nums) {
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i])
                return i-1;
        }
        return nums.length-1;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={1,1,1,3,5,6};
        System.out.println(sol.findPeakElement(nums));
    }
}
