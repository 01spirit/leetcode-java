package 数对和;

import java.util.*;

public class Solution {
    public List<List<Integer>> pairSums(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int left=0,right= nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                List<Integer> tmp=new ArrayList<>();
                tmp.add(nums[left]);
                left++;
                tmp.add(nums[right]);
                right--;
                ans.add(tmp);
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={5,6,5,6};
        int target=11;
        System.out.println(Arrays.toString(sol.pairSums(nums,target).toArray()));
    }
}
