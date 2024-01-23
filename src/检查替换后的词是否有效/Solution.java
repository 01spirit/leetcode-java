package 检查替换后的词是否有效;

public class Solution {
    public boolean isValid(String s) {

//        System.out.println(s.contains("abc"));

        while(!"".equals(s)){
            if(s.contains("abc")){
                s=s.replace("abc","");
            }
            else{
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="abccba";
        System.out.println(sol.isValid(s));

    }
}
