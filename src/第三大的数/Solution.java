package 第三大的数;

import java.util.*;

public class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        return list.size()<3?list.get(list.size()-1):list.get(list.size()-3);
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int [] nums={1,2};
        System.out.println(sol.thirdMax(nums));
    }
}
