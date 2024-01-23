package 二分查找;

public class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        while(left<=right){
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
                mid=(left+right)/2;
            }
            else{
                right=mid-1;
                mid=(left+right)/2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={-1,0,3,5,9,12};
        int target= 12;
        System.out.println(sol.search(nums,target));
    }
}
