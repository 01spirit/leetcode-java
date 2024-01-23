package 商店的最小代价;

public class Solution {
    public int bestClosingTime(String customers) {
        int len=customers.length();
        int cost=0;
        int minCost=0;
        int minCostIndex=0;

        for(int i=0;i<len;i++){
            if(customers.charAt(i)=='Y'){
                cost++;
            }
            else{
                cost--;
            }
            if(minCost<cost){
                minCost=cost;
                minCostIndex=i+1;
            }
        }
        return minCostIndex;
    }

    public static void main(String[] args) {
        String customers="YYNY";
        Solution sol=new Solution();

        System.out.println(sol.bestClosingTime(customers));
    }

}
