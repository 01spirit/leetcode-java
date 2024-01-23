package 菱形个数;

import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,y;

        while(in.hasNextInt()){
            x=in.nextInt();
            y=in.nextInt();
            int min=Math.min(x,y);//长和宽的最小值
            int max=Math.max(x,y);
            int count=0;//总数
            int minHr=min/2;
            int maxHr=max/2;

            for(int i=1;i<=minHr;i++){
                for(int j=1;j<=maxHr;j++){
                    count=count+(min-2*i+1)*(max-2*j+1);
                }
            }



            System.out.println(count);
        }


    }
}
