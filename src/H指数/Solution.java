package H指数;

import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n= citations.length-1;
        int res=0;
        while(n>=0&&citations[n]>res){
            res++;
            n--;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] citations={11,15};
        System.out.println(sol.hIndex(citations));
    }
}
