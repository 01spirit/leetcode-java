package 隐藏个人信息;

public class Solution {
    public String maskPII(String s) {
        String[] country= {"","+*-","+**-","+***-"};
        char at='@';
        String res;
        int len=s.length();

        if(s.indexOf(at)>0){
            s=s.toLowerCase();
            res=s.charAt(0)+"*****"+s.substring(s.indexOf(at)-1);
            return res;
        }
        s = s.replaceAll("[^0-9]", "");
        res=country[s.length()-10]+"***-***-"+s.substring(s.length()-4);
        return res;

    }

    public static void main(String[] args){
        String s="1(234)567-890";
        Solution sol=new Solution();
        System.out.println(sol.maskPII(s));
    }
}
