package 从两个数字数组中生成最小数字;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int res=same(nums1,nums2);
        if(res!=-1){
            return res;
        }
        int x= Arrays.stream(nums1).min().getAsInt();
        int y=Arrays.stream(nums2).min().getAsInt();
        return Math.min(x*10+y,x+y*10);
    };

    public int same(int[] nums1,int[] nums2){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        int n=10;
        for(int num:nums2){
            if(set.contains(num)){
                n=Math.min(n,num);
            }
        }
        return n==10?-1:n;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums1 = {4,1,3}, nums2 = {5, 7};
        System.out.println(sol.minNumber(nums1,nums2));
    }
}
