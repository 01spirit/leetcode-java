package 交换一次的先前排列;

import java.util.Arrays;

public class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                int j = n - 1;
                while (arr[j] >= arr[i] || arr[j] == arr[j - 1]) {
                    j--;
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr={1,9,4,6,7};
        Solution sol=new Solution();
        System.out.println(sol.prevPermOpt1(arr)[2]);
    }
}
