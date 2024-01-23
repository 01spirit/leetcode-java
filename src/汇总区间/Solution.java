package 汇总区间;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<>();
        if(nums.length==0)
            return res;

        int i=0;
        while(i<nums.length){
            int left=i;
            i++;
            while(i<nums.length&&nums[i]-nums[i-1]==1){
                i++;
            }
            int right=i-1;
            StringBuilder sb=new StringBuilder();
            sb.append(Integer.toString(nums[left]));
            if(left<right){
                sb.append("->");
                sb.append(nums[right]);
            }
            res.add(sb.toString());
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int []nums={0,2,3,4,6,8,9};//
        System.out.println(sol.summaryRanges(nums));
    }
}
