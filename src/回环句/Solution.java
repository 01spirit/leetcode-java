package 回环句;

public class Solution {
    public boolean isCircularSentence(String sentence) {
        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1)){
            return false;
        }
        for(int i=0;i<sentence.length()-1;i++){
            if(sentence.charAt(i)==' '&&sentence.charAt(i-1)!=sentence.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence= "Leetcode is cool";
        Solution sol=new Solution();
        System.out.println(sol.isCircularSentence(sentence));
    }
}
