package 使数组元素全部相等的最小操作次数;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length;
        var sum = new long[n + 1]; // 前缀和
        for (int i = 0; i < n; ++i)
            sum[i + 1] = sum[i] + nums[i];

        var ans = new ArrayList<Long>(queries.length);
        for (int q : queries) {
            int j = lowerBound(nums, q);
            long left = (long) q * j - sum[j]; // 蓝色面积
            long right = sum[n] - sum[j] - (long) q * (n - j); // 绿色面积
            ans.add(left + right);
        }
        return ans;
    }

    private int lowerBound(int[] nums, int target) {
        int left = -1, right = nums.length; // 开区间 (left, right)
        while (left + 1 < right) { // 区间不为空
            // 循环不变量：
            // nums[left] < target
            // nums[right] >= target
            int mid = left + (right - left) / 2;
            if (nums[mid] < target)
                left = mid; // 范围缩小到 (mid, right)
            else
                right = mid; // 范围缩小到 (left, mid)
        }
        return right;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={3,1,6,8};
        int[] queries={1,5};
        System.out.println(sol.minOperations(nums,queries));
    }
}
