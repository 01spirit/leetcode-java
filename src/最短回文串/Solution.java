package 最短回文串;

public class Solution {
    public String shortestPalindrome(String s) {
        int len=s.length();
        char[] rvs=new char[len];
        StringBuilder sRvs=new StringBuilder();

        for(int i=len-1;i>=0;i--){
            rvs[len-1-i]=s.charAt(i);
        }
        sRvs.append(rvs);
        String ssRvs=sRvs.toString();
        if(ssRvs.equals(s)){
            return s;
        }

        int flag=0;
        for(int i=len-1;i>=0;i--){//原字符串和逆序字符串从长到短匹配，找到第一个匹配子串的长度，拼接其剩余部分得到回文串
            String subOri=s.substring(0,i+1);
            String subSrvs=ssRvs.substring(len-1-i);
            if(subOri.equals(subSrvs)){
                flag=i;
                break;
            }
        }

        String ss=ssRvs.substring(0,len-1-flag)+s;

        return ss;
    }

    public static void main(String[] args) {
        Solution sol= new Solution();
        String s="abcd";
        System.out.println(sol.shortestPalindrome(s));
    }
}
