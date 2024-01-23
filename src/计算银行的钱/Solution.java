package 计算银行的钱;

public class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int dvd=n/7;
        int rdt=n%7;
//        System.out.println(rdt);
        sum+=7*8/2*(dvd)+dvd*(dvd-1)/2*7+rdt*(rdt+1)/2+dvd*rdt;

        return sum;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n= 4;
        System.out.println(sol.totalMoney(n));
    }
}
