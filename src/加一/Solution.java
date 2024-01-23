package 加一;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        int[] res=new int[len];

        //一次遍历，时间最优，内存消耗大
        int plus=1;
        for(int i=len-1;i>=0;i--){
//            System.out.println(digits[i]);
            res[i]=(digits[i]+plus)%10;
            if(res[i]==0 && plus==1){
                plus=1;
            }
            else{
                plus=0;
            }
        }

        //模拟9999加法，有更优写法
        /*if(plus==1){
            int[] nres=new int[len+1];
            nres[0]=1;

            for(int i=len;i>0;i--){
                nres[i]=res[i-1];
            }
            return nres;
        }*/
        //更优解法
        int[] ndigits=new int[len+1];
        ndigits[0]=1;

        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] digits={8,9,9};
        System.out.println(Arrays.toString(sol.plusOne(digits)));
    }
}
