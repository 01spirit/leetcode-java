package 摆动排序;

import java.util.Arrays;

public class Solution {
    public void wiggleSort(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int n = nums.length;
        int x = (n + 1) / 2;
        for (int i = 0, j = x - 1, k = n - 1; i < n; i += 2, j--, k--) {
            nums[i] = arr[j];
            if (i + 1 < n) {
                nums[i + 1] = arr[k];
                System.out.println(arr[k]);
            }
        }
    /*for(int num:nums){
        System.out.println(num);
    }*/
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={6,5,5,4};
        sol.wiggleSort(nums);
    }
}
