package 最长公共前缀;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder pre=new StringBuilder();
        pre.append(strs[0]);
        for(String str:strs){
            if(str.length()<pre.length()){
                pre.delete(str.length(),pre.length());
            }
            for(int i=0;i<pre.length();i++){
                if(str.charAt(i)!=pre.charAt(i)){
                    pre.delete(i,pre.length());
                }
            }
        }
        return pre.toString();
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String[] strs={"flower","flow","flight"};
        System.out.println(sol.longestCommonPrefix(strs));
    }
}
