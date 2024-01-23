package 排列硬币;

public class Solution {
    public int arrangeCoins(int n){
        int left=1,right=n;
        while(left<right){
            int mid=(right+left+1)/2;
            if ((long)mid*(mid+1)<=(long)n*2) {
                left=mid;
            }
            else{
                right=mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n= 8;
        System.out.println(sol.arrangeCoins(n));
    }
}
