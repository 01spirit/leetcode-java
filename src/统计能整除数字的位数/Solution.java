package 统计能整除数字的位数;

import java.util.ArrayList;

public class Solution {
    public int countDigits(int num) {
        int res=0;
        /*ArrayList arrayList=new ArrayList();
        while(num>0){
            int val=num%10;
            arrayList.add(val);
            num/=10;
        }

        System.out.println(arrayList.toString());*/

        int pri=num;
        while(num>0){
            int val=num%10;
            if (pri % val == 0) {
                res++;
            }
            num/=10;
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int num=5;
        System.out.println(sol.countDigits(num));
    }
}
