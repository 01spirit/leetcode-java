package 将数组和减半的最少操作次数;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

//用 double
public class Solution {
    public int halveArray(int[] nums) {
        int cnt=0;
        double total=0;
        double subsum=0;
        PriorityQueue<Double> queue=new PriorityQueue<>((a,b)->(b.compareTo(a)));
        for(int num:nums){
            queue.offer((double)num);
            total+=num;
        }
        while(subsum<(total/2)){
            double num=queue.poll();
            subsum+=num/2;
            cnt++;
            queue.offer(num/2);
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={32,98,23,14,67,40,26,9,96,96,91,76,4,40,42,2,31,13,16,37,62,2,27,25,100,94,14,3,48,56,64,59,33,10,74,47,73,72,89,69,15,79,22,18,53,62,20,9,76,64};
        System.out.println(sol.halveArray(nums));
    }
}
