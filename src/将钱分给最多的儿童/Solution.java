package 将钱分给最多的儿童;

import java.util.Scanner;

public class Solution {
    public int distMoney(int money, int children) {
        money-=children;
        if(money<0){
            return -1;
        }
        int ans=Math.min(money/7,children);
        money-=ans*7;
        children-=ans;
        if(children==0&&money>0||children==1&&money==3){
            --ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        Scanner in=new Scanner(System.in);
        int money=0;
        int children=0;

        while(in.nextInt()!=-1){
            money=in.nextInt();
            children=in.nextInt();
            System.out.println(sol.distMoney(money,children));
        }
    }
}
