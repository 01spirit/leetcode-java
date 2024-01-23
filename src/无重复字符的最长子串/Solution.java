package 无重复字符的最长子串;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Solution {
    public int lengthOfLongestSubstring(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0, start = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (map.containsKey(ch)){
                start = Math.max(map.get(ch)+1,start);//从第一个重复的字符开始再次匹配
            }
            max = Math.max(max,end - start + 1);
            map.put(ch,end);
        }
        return max;
    }

    public static void main(String[] args){
        Solution sol=new Solution();
        String  s;
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("input string:");
            s=in.next();
            if(s=="q"){
                return;
            }else{
                System.out.println(sol.lengthOfLongestSubstring(s));
            }

        }


    }
}
