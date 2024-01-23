package 倍数求和;

public class Solution {
    public int sumOfMultiples(int n) {
        int res=0;

        if(n<3){
            return 0;
        }

        for(int i=3;i<=n;i++){
            if( i%3==0 || i%5==0 || i%7==0 ){
                res+=i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n=10;
        System.out.println(sol.sumOfMultiples(n));
    }
}
