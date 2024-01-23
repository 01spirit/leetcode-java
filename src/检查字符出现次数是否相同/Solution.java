package 检查字符出现次数是否相同;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> count=new HashMap<Character,Integer>();
        for(char ch:s.toCharArray()){
            count.put(ch, count.getOrDefault(ch,0)+1);
        }
        int cnt=count.get(s.charAt(0));

        for(Map.Entry<Character,Integer> entry:count.entrySet()){
            if(cnt!=entry.getValue()){
                return false;
            }
        }
                return true;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="aaabb";
        System.out.println(sol.areOccurrencesEqual(s));

    }
}
