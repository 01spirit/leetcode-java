package 删除一次得到子数组最大和;

public class Solution {
    public int maximumSum(int[] arr) {
        int dp0=arr[0];
        int dp1=0;
        int sum=arr[0];

        for(int i=1;i<arr.length;i++){
            dp1=Math.max(dp1+arr[i],dp0);
            dp0=Math.max(dp0,0)+arr[i];
            sum=Math.max(sum,Math.max(dp0,dp1));
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] arr={1,-2,0,3};
        System.out.println(sol.maximumSum(arr));
    }
}
