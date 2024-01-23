package 宝石与石头;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int len=jewels.length();
        int cnt=0;
        Set<Character> hashChar=new HashSet<>();
        for(char ch:jewels.toCharArray()){
            hashChar.add(ch);
        }
        for(char ch:stones.toCharArray()){
            if(hashChar.contains(ch)){
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String jewels = "a", stones = "aAaaAAbb";
        System.out.println(sol.numJewelsInStones(jewels,stones));
    }
}
