package 公因子数目;

public class Solution {
    public int commonFactors(int a, int b) {
        int max_fac=a<b?a:b;
        int count=0;
        for(int i=1;i<=max_fac;i++){
            if(a%i==0&&b%i==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int a=25;
        int b=30;
        Solution sol=new Solution();
        System.out.print(sol.commonFactors(a,b));
    }
}
