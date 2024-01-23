package 最小偶倍数;

public class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==1){
            return n*2;
        }
        return n;

    }

    public static void main(String[] args) {
        int n=5;
        Solution sol=new Solution();

        System.out.println(sol.smallestEvenMultiple(n));
    }
}
