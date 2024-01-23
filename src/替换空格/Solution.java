package 替换空格;

public class Solution {
    public String replaceSpace(String s) {
        return s.replaceAll(" ","%20");
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="We are happy.";
        System.out.println(sol.replaceSpace(s));
    }
}
