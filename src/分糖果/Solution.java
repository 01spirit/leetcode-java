package 分糖果;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> candySet=new HashSet<Integer>();
        for(int candy:candyType){
            candySet.add(candy);
        }
        /*for(int candy:candySet){
            System.out.println(candy);
        }*/
        return Math.min(candySet.size(),candyType.length/2);
    }

    public static void main(String[] args) {
        int[] candyType={1,1,2,3,3,4};
        Solution sol=new Solution();
        System.out.println(sol.distributeCandies(candyType));
    }
}
