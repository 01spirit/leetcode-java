package 整数的各位积和之差;

public class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1;
        int sum=0;
        while(n>0){
            int num=n%10;
            n/=10;
            mul*=num;
            sum+=num;
        }
        return mul-sum;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n= 4421;
        System.out.println(sol.subtractProductAndSum(n));
    }
}
