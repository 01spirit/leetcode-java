package 反转字符串中的单词;

import java.util.Arrays;

public class Solution {
    public String reverseWords(String s) {
        String[] str;
        str=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
//        System.out.println(Arrays.toString(str));
        for(int i=str.length-1;i>=0;i--){
            if(!str[i].equals("")){
                sb.append(str[i]+" ");
//                System.out.println(str[i]);
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="the     sky   is blue";
        System.out.println(sol.reverseWords(s));
    }
}
