package 比较含退格符的字符串;

public class Solution {
    public boolean backspaceCompare(String s, String t) {
        return stack(s).equals(stack(t));
    }

    //对于字符串，使用可变长字符串StringBuffer模拟栈进行实现，非退格符append()入栈，退格符deleteCharAt()出栈，结果返回toString()
    public String stack(String s){
        int len=s.length();
        StringBuffer changedS=new StringBuffer();
        for(char ch:s.toCharArray()){
            if(ch!='#'){
                changedS.append(ch);
            }
            else{
                if(changedS.length()>0){
                    changedS.deleteCharAt(changedS.length()-1);
                }
            }
        }
        return changedS.toString();
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="ab##";
        String t="c#d#";
        System.out.println(sol.backspaceCompare(s,t));
    }
}
