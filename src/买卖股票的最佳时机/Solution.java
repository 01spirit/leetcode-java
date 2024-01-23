package 买卖股票的最佳时机;

public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(minPrice>prices[i]){
                minPrice=prices[i];
            }
            else{
                if(prices[i]-minPrice>maxProfit){
                    maxProfit=prices[i]-minPrice;
                }
            }

        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] prices={7,6,4,3,1};
        System.out.println(sol.maxProfit(prices));
    }
}
