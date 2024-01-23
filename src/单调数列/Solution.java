package 单调数列;

public class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=true,dec=true;

        for(int i=0;i< nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                dec=false;
            }
            if(nums[i]>nums[i+1]){
                inc=false;
            }
        }
        return inc||dec;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={6,5,4,4};
        System.out.println(sol.isMonotonic(nums));
    }
}
