package 快速幂_猴子碰撞;

public class Solution {
    int mod = (int)1e9 + 7;
    public int MonkeyMove(int n){
        return  (int)(pow(n,2,mod)-2+mod)%mod;
    }

    long pow(long n,long x,int mod){
        long res=1;
        for(;n>0;n/=2){
            if(n%2==1){
                res=res*x%mod;
            }
            x=x*x%mod;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n= 4;
        System.out.println(sol.MonkeyMove(n));

    }
}
