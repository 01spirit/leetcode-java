package 斐波那契数;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int fib(int n) {
        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(1);
        if(n<=1){
            return n;
        }
        int cnt=2;
        while(cnt<=n){
            list.add(list.get(cnt-2)+list.get(cnt-1));
            cnt++;
        }
        return list.get(cnt-1);
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n= 7;
        System.out.println(sol.fib(n));
    }
}
