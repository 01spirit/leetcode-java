package 检查A在B之前;

public class Solution {
    public boolean checkString(String s) {
        if(s.contains("ba")){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="b";
        System.out.println(sol.checkString(s));
    }
}
