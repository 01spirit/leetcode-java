package 质因数之和;

public class Solution {
    public int smallestValue(int n) {
        int ans=0;
        int tmp=n;
        for(int i=2;tmp>1;i++){
            while(tmp%i==0){
                tmp/=i;
                ans+=i;
//                System.out.println(i);
            }
        }
//        System.out.println(ans);
//        System.out.println();
        return ans==n?n:smallestValue(ans);
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n= 8;
        System.out.println(sol.smallestValue(n));
    }
}
