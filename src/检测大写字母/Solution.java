package 检测大写字母;

public class Solution {
    public boolean detectCapitalUse(String word) {
        int len=word.length();
        boolean bl=true;
        if(len==1){
            return true;
        }
        char first=word.charAt(0);
        if(Character.isLowerCase(first)){
            bl=false;//小写
        }
        for(int i=1;i<len;i++){
            if(!bl&&!Character.isLowerCase(word.charAt(i))){
                return false;
            }
            if(i>1&&bl&&Character.isLowerCase(word.charAt(i))){
                return false;
            }
            if(Character.isLowerCase(word.charAt(i))){
                bl=false;
            }
        }

        if(bl&&Character.isLowerCase(word.charAt(word.length()-1))){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String word = "FlaG";
        System.out.println(sol.detectCapitalUse(word));
    }
}
