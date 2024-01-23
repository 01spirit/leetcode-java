package 从数量最多的堆取走礼物;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public long pickGifts(int[] gifts, int k) {
        long res=0;
        int len=gifts.length;

        //循环k次，每次都通过排序找到最大值，取其平方根，然后求数组元素之和即为结果
        //时间和内存都不好
        /*for(int i=0;i<k;i++){
            Arrays.sort(gifts);
            gifts[len-1]=(int)Math.sqrt(gifts[len-1]);
        }
        for(int g:gifts){
            res+=g;
        }*/

        //使用优先级队列构建大顶堆，每次取堆顶元素求平方根后重新构建大顶堆
        //时间和空间复杂度都比较好
        //循环中排序的时间复杂度大于调整堆的时间复杂度，所以用优先队列速度更快
        PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->b-a);//用lambda表达式设置为大顶堆，最大元素始终在堆顶
        for(int gift:gifts){
            queue.offer(gift);//数组元素入堆并调整堆结构
        }
        for(int i=1;i<=k;i++){
            int tmp=queue.poll();
            tmp=(int)Math.sqrt(tmp);
            queue.offer(tmp);
        }
        for(int gift:queue){
            res+=gift;
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] gifts={
//                25,64,9,4,100
            1,1,1,1
        };
        int k=4;
        System.out.println(sol.pickGifts(gifts,k));
    }
}
