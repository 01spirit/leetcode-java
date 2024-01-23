package 切割后面积最大的蛋糕;

import java.util.Arrays;

public class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int mod = 1000000007;
        long maxH=Math.max(h-horizontalCuts[horizontalCuts.length-1],horizontalCuts[0]);
        long maxV=Math.max(w-verticalCuts[verticalCuts.length-1],verticalCuts[0]);
        if(horizontalCuts.length>=2){
            for(int i=0;i< horizontalCuts.length-1;i++){
                maxH=Math.max(maxH,Math.abs(horizontalCuts[i]-horizontalCuts[i+1]));
            }
        }
        if(verticalCuts.length>=2){
            for(int j=0;j< verticalCuts.length-1;j++){
                maxV=Math.max(maxV,Math.abs(verticalCuts[j]-verticalCuts[j+1]));
            }
        }
//        System.out.println(maxH);
//        System.out.println(maxV);

        return (int)((maxH*maxV)%mod);
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int h = 5, w = 4;
        int[] horizontalCuts = {3}, verticalCuts = {3};
        System.out.println(sol.maxArea(h,w,horizontalCuts,verticalCuts));
    }
}
