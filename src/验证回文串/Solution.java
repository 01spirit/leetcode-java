package 验证回文串;

public class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer trimS=new StringBuffer();
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                trimS.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer revTrimS=new StringBuffer(trimS).reverse();
//        System.out.println(revTrimS);
//        System.out.println(trimS);

        return trimS.toString().equals(revTrimS.toString());
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="race a car";
        System.out.println(sol.isPalindrome(s));
    }
}
