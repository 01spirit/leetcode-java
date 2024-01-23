package 最小公共值;

public class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        for(int i=0,j=0;i<nums1.length&&j<nums2.length;){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums1={1,2,3};
        int[] nums2={2,4};
        System.out.println(sol.getCommon(nums1,nums2));
    }
}
