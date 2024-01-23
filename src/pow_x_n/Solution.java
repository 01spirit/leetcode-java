package pow_x_n;

public class Solution {

/*
        double res=1;
        if(n>0){
            for(int i=0;i<n;i++){
                res*=x;
            }
        }
        else if(n==0){
            res=1;
        }
        else if(n<0){
            for(int i=0;i<(-n);i++){
                res/=x;
            }
        }

        return res;

 */
        public double myPow(double x, int n) {
            long N = n;
            return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
        }

        public double quickMul(double x, long N) {
            if (N == 0) {
                return 1.0;
            }
            double y = quickMul(x, N / 2);
            return N % 2 == 0 ? y * y : y * y * x;
        }



    public static void main(String[] args){
        double x=1;
        int n=
        2147483647;
        Solution sol=new Solution();
        System.out.print(sol.myPow(x,n));
    }
}
