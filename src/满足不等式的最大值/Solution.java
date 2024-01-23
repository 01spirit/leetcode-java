package 满足不等式的最大值;

import java.util.PriorityQueue;

public class Solution {
    public int findMaxValueOfEquation(int[][] points, int k){
        PriorityQueue<int[]> heap=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int res=Integer.MIN_VALUE;

        //使用优先级队列，构建大顶堆，把point[0]-point[1]最大的元素放在堆顶
        for(int[] point:points){
            int x=point[0],y=point[1];
            while(!heap.isEmpty()&&x-heap.peek()[1]>k){
                heap.poll();//和大于k，直接弹出
            }
            if(!heap.isEmpty()){//比较res和当前节点的结果
                res=Math.max(res,x+y-heap.peek()[0]);
            }
            heap.offer(new int[]{x-y,x});//把当前结点的结构入队
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[][] points= {{1, 3},{
            2, 0
        },{
            5, 10
        },{
            6, -10
        }};
        int k=1;
        System.out.println(sol.findMaxValueOfEquation(points,k));
    }
}
