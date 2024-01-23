package 数组相对排序;

import java.util.Arrays;

public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int upper=-1;
        for(int num:arr1){
            upper=Math.max(upper,num);
        }
        int[] count=new int[upper+1];
        int[] ans=new int[arr1.length];
        for(int num:arr1){
            count[num]++;
        }
//        System.out.println(Arrays.toString(count));
        int index=0;
        for(int num:arr2){
            for(int i=0;i<count[num];i++){
                ans[index]=num;
                index++;
            }
            count[num]=0;
        }
        for(int i=0;i<upper+1;i++){
            for(int j=0;j<count[i];j++){
                ans[index]=i;
                index++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] arr1={2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2={2,1,4,3,9,6};
        System.out.println(Arrays.toString(sol.relativeSortArray(arr1,arr2)));
    }
}
