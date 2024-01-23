package 最后一个单词的长度;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split("\\s");
        return str[str.length-1].length();
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String s= "   fly me   to   the moon  ";
        System.out.println(sol.lengthOfLastWord(s));
    }
}
