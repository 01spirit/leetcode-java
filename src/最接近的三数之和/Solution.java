package 最接近的三数之和;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
//        int sum=0;
        int len=nums.length;
        int best=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<len;++i){
            if(i>0&&nums[i-1]==nums[i]){
                continue;
            }
            int left=i+1,right=len-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return target;
                }
                if(Math.abs(sum-target)<Math.abs(best-target)){
                    best=sum;
                }
                if(sum>target){
                    int k0=right-1;
                    while(left<k0&&nums[k0]==nums[right]){
                        --k0;
                    }
                    right=k0;
                }
                else{
                    int j0=left+1;
                    while(j0<right&&nums[j0]==nums[left]){
                        ++j0;
                    }
                    left=j0;
                }
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int[] nums={-1,2,1,-4};
        int target= 1;
        Solution sol=new Solution();
        System.out.println(sol.threeSumClosest(nums,target));
    }
}
