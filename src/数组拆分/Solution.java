package 数组拆分;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {


    public static void main(String[] args){
        int n=0,k=0;


        Scanner in=new Scanner(System.in);
        n=in.nextInt();//数据数量
        k=in.nextInt();//分组数量
        int[] nums=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        int[] sortedNums=new int[n];
        sortedNums= Arrays.stream(nums).sorted().toArray();

        int groupNum=n/k;//k-1的每组数据数量
        int lastGroup=n-(k-1)*groupNum;//k的数据数量

        double avgSum=0.0;
        double sum=0;
        for(int i=0;i<(k-1)*groupNum;i+=groupNum){
            for(int j=i;j<i+groupNum;j++){
                sum+=sortedNums[j];
            }
            avgSum+=(double) (sum/groupNum);
            sum=0;
        }
        sum=0;
        for(int i=(k-1)*groupNum;i<n;i++){
            sum+=sortedNums[i];
        }
        avgSum+=(double) (sum/lastGroup);
        sum=0;

        System.out.println(avgSum);

    }


}
