package 合并石头的最低成本;

public class Solution {
    public int totalCost=0;
    public int minCost=301;
    public int flag=0;
    public int mergeStones(int[] stones, int k) {

        int temp=0;

        int len=stones.length;

        while(len>=k){
            for(int i=0;i<len-k+1;i++){
                for(int j=i;j<k+i;j++){
                    temp+=stones[j];
                }
                if(temp<minCost){
                    flag=i;
                }
                minCost=temp>minCost?minCost:temp;

                temp=0;
            }
            stones[flag]=minCost;
            for(int i=flag+1;i<=len-k;i++){
                stones[i]=stones[i+k-1];
            }
            totalCost+=minCost;

            //System.out.println(minCost);

            minCost=301;
            len-=(k-1);

            for(int i=0;i<len;i++){
                System.out.println(stones[i]);
            }



        }


        if(len!=1){
            return -1;
        }
        else {
            return totalCost;
        }

//        return totalCost;
    }

    public static void main(String[] args){
        Solution sol=new Solution();
        int [] stones={6,4,4,6};
        int k= 2;
        int res=sol.mergeStones(stones,k);
        System.out.print(res);
    }
}
