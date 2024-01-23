package 老鼠和奶酪;

import java.util.Arrays;

public class Solution {

    //初始sum为reward2之和，计算reward1与reward2的差值存入sub，排序sub后把k个最大值加入sum，即为结果
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int[] sub=new int[reward1.length];
        int sum=0;
        for(int i=0;i< reward1.length;i++){
            sub[i]=reward1[i]-reward2[i];
            sum+=reward2[i];
        }
        Arrays.sort(sub);
        for(int i=reward1.length-1;i>reward1.length-k-1;i--){
            sum+=sub[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] reward1={1,1};
        int[] reward2={1,1};
        int k=2;
        System.out.println(sol.miceAndCheese(reward1,reward2,k));
    }
}
