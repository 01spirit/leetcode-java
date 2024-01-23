package 翻转单词顺序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String reverseWords(String s){
        s=s.trim();
        List<String> spList= Arrays.asList(s.split("\\s+"));//正则匹配空白字符串，用空格作为分隔符
        Collections.reverse(spList);
        return String.join(" ",spList);//对spList中的每个元素用“ ”连接
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="the sky is blue";
        System.out.println(sol.reverseWords(s));
    }
}
