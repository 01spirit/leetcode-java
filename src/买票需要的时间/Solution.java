package 买票需要的时间;

public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        int len=tickets.length;

//        //超时
//        while(tickets[k]!=0){
//            for(int i=0;i<len&&tickets[i]!=0;i++){
//                tickets[i]--;
//                time++;
//                if(tickets[k]==0)
//                    break;
//
//            }
//            //System.out.println(tickets[k]);
//
//        }

        //计算在k完成前每个人的次数之和即为总耗时
        for(int i=0;i<len;i++){
            if(i<=k){
                time+=Math.min(tickets[k],tickets[i]);

            }
            else{
                time+=Math.min(tickets[i],tickets[k]-1);
            }
        }


        return time;
    }

    public static void main(String[] args) {
        int[] tickets={84,49,5,24,70,77,87,8};
        int k=3;
        Solution sol=new Solution();

        System.out.println(sol.timeRequiredToBuy(tickets,k));
    }
}
