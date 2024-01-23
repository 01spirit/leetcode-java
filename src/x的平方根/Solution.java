package x的平方根;

public class Solution {
    public int mySqrt(int x) {
        int left=0;
        int right=x;
        int res=0;

        while(left<=right){
            int mid=left+(right-left)/2;
            if( (long)mid * mid<= x ){
                left=mid+1;
                res=mid;
            }
            else{
                right=mid-1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int x=8;
        System.out.println(sol.mySqrt(x));
    }
}
