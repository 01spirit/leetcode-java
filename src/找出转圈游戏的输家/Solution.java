package 找出转圈游戏的输家;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean[] res=new boolean[n];

        for(int i=k,j=0;!res[j];i+=k){
            res[j]=true;
            j=(j+i)%n;
        }

        List<Integer> los=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!res[i]){
//                System.out.println(res[i]);
                los.add(i+1);
            }
        }

        int[] rrs=new int[los.size()];
        for(int i=0;i<los.size();i++){
            rrs[i]= los.get(i);
        }

        return rrs;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n = 5, k = 2;
        System.out.println(Arrays.toString(sol.circularGameLosers(n,k)));
    }
}
