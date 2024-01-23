package 给定前缀的字符串;

public class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String word:words){
            if(word.startsWith(pref)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String pref="at";
        String[] words={"pay","attention","practice","attend"};
        Solution sol=new Solution();
        System.out.println(sol.prefixCount(words,pref));
    }
}
