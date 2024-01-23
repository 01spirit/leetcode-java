package 快乐数;

import java.util.ArrayList;

public class Solution {
    public boolean isHappy(int n) {

        ArrayList arrayList=new ArrayList();//使用链表存储循环过程中出现的中间数字，如果再次出现，说明进入了循环，返回 false
        //在没回归到 1 之前循环，或者在进入循环后直接返回
        while(n!=1){
            int num=0;
            //拆解 n ，计算中间数字
            while(n>0){
                num+=(n%10)*(n%10);
                n/=10;
            }
            n=num;
            if(!arrayList.contains(n)){//查询是否进入循环
                arrayList.add(n);
            }
            else{
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n=7;
        System.out.println(sol.isHappy(n));
    }
}
