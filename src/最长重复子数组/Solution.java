package 最长重复子数组;

public class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int len1= nums1.length;
        int len2= nums2.length;
        int maxLen=0;
        int[][] dp=new int[len1+1][len2+1];

        for(int i=len1-1;i>=0;i--){
            for(int j=len2-1;j>=0;j--){
                if(nums1[i]==nums2[j]){
                    dp[i][j]=dp[i+1][j+1]+1;
                    maxLen=Math.max(maxLen,dp[i][j]);

                }
//                System.out.println(dp[i][j]);
            }
//            System.out.println();
        }


        return maxLen;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums1={1,2,3,2,1};
        int[] nums2={3,2,1,4,7};
        System.out.println(sol.findLength(nums1,nums2));
    }
}
