package 移除元素;

public class Solution {
    public int removeElement(int[] nums, int val){
        int left=0;
        int len=nums.length;

        for(int i=0;i<len;i++){
            if(nums[i]!=val){
                nums[left]=nums[i];
                left++;
            }

        }
        return left;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums= {0, 1, 2, 2, 3, 0, 4, 2};
        int val=2;

        System.out.println(sol.removeElement(nums,val));
    }
}
