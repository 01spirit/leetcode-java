package 两点间最宽垂直区域;

import java.util.Arrays;

public class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xnums=new int[100000];
        int count=0;
        int maxWidth=0;

        for(int i=0 ;i< points.length;i++){
            xnums[count]=points[i][0];//System.out.println(xnums[count]);
            count++;
        }
/*
//冒泡排序超出时间限制
        int temp = 0;
        for(int i=0;i<count-1;i++){
            for(int j=0;j< count-i-1;j++){
                if(xnums[j]>xnums[j+1]){
                    temp=xnums[j];
                    xnums[j]=xnums[j+1];
                    xnums[j+1]=temp;
                }
            }

        }

 */
        //截取出有效的新数组，用Arrays.sort()从小到大排序
        int[] x=new int[count];
        for(int i=0;i<count;i++){
            x[i]=xnums[i];
        }
        Arrays.sort(x);

        for(int i=0;i< count-1;i++){
//           System.out.println(x[i]);
            maxWidth=(x[i+1]-x[i])>maxWidth?(x[i+1]-x[i]):maxWidth;
        }
        return maxWidth;
    }

    public static void main(String[] args){
        Solution sol=new Solution();
        int[][] points={{3,7},{9,9},{1,4},{1,7},{5,4},{8,7}};
        System.out.print(sol.maxWidthOfVerticalArea(points));
    }
}
