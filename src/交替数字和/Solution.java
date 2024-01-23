package 交替数字和;

import java.util.Arrays;

public class Solution {
    public int alternateDigitSum(int n) {
        boolean signal=true;
        int[] nums=new int[10];
        int count=0;
        while(n>0){
            nums[count]=n%10;
            count++;
            n/=10;
        }
        int sum=0;
        for(int i=count-1;i>=0;i--){
//            System.out.println(nums[i]);
            if(signal){
                sum+=nums[i];
                signal=false;
            }
            else{
                sum-=nums[i];
                signal=true;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n=886996;
        System.out.println(sol.alternateDigitSum(n));
    }
}
