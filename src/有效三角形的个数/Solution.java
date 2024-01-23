package 有效三角形的个数;

import java.util.Arrays;

public class Solution {
    public int triangleNumber(int[] nums){
        if(nums.length<=2){
            return 0;
        }
        int len=nums.length;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<len-2;i++){
            for(int j=i+1;j<len-1;j++){
                for(int k=len-1;k>j;k--){
                    if(nums[i]+nums[j]>nums[k]){
                        count+=k-j;
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={7,0,0,0};
        System.out.println(sol.triangleNumber(nums));
    }
}
