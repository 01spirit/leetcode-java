package 三数之和;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();

        for(int first=0;first< nums.length;first++){

            if(first>0&&nums[first]==nums[first-1]){
                continue;
            }
            int third= nums.length-1;
            int target=-nums[first];
            for(int second=first+1;second< nums.length;second++){
                if(second>first+1&&nums[second]==nums[second-1]){
                    continue;
                }
                while(second<third&&nums[second]+nums[third]>target){
                    third--;
                }
                if(second==third){
                    break;
                }
                if(nums[second]+nums[third]==target){
                    List<Integer> sum=new ArrayList<>();
                    sum.add(nums[first]);
                    sum.add(nums[second]);
                    sum.add(nums[third]);
                    res.add(sum);
//                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(Arrays.toString(sol.threeSum(nums).toArray()));
    }
}
