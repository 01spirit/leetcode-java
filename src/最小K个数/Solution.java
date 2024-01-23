package 最小K个数;

import java.util.Arrays;

public class Solution {
    public int[] smallestK(int[] arr, int k){
        Arrays.sort(arr);
        int[] res=new int[k];

        for(int i=0;i<k;i++){
            res[i]=arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int k=4;
        int[] arr={1,3,5,7,2,4,6,8};
        int[] res=sol.smallestK(arr,k);
        for(int i=0;i< res.length;i++){
            System.out.println(res[i]);
        }

    }
}
