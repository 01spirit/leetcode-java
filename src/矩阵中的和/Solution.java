package 矩阵中的和;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    //数组排序
    public int matrixSum(int[][] nums){
        int score=0;
        int len=nums[0].length;
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }
        for(int cnt=0;cnt<len;cnt++){
            int max=0;
            for(int i=0;i<nums.length;i++){
                max=Math.max(max,nums[i][len-1-cnt]);
            }
            score+=max;
        }

        return score;
    }

    //用大顶堆，复杂而且效率差
   /* public int matrixSum(int[][] nums){
        int res=0;
        int m=nums.length;
        int n=nums[0].length;
        PriorityQueue<Integer>[] pq=new PriorityQueue[m];
        for(int i=0;i<m;i++){
            pq[i]=new PriorityQueue<>((a,b)->b-a);
            for(int j=0;j<n;j++){
                pq[i].offer(nums[i][j]);//在队尾插入元素并调整堆结构
            }
        }
        for(int j=0;j<n;j++){
            int maxVal=0;
            for(int i=0;i<m;i++){
                maxVal=Math.max(maxVal,pq[i].poll());//获取队头元素并删除，再调整堆结构
            }
            res+=maxVal;
        }
        return res;
    }*/

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[][] nums={{
            7, 2, 1
        },{
            6, 4, 2
        },{
            6, 5, 3
        },{
            3, 2, 1
        }};
        System.out.println(sol.matrixSum(nums));
    }
}
