package 交替位二进制数;

public class Solution {
    public boolean hasAlternatingBits(int n) {
        String bool=Integer.toBinaryString(n);
//        System.out.println(bool);
        if(bool.length()<=1){
            return true;
        }
        for(int i=0;i<bool.length()-1;i++){
            if(bool.charAt(i)==bool.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n=115;
        System.out.println(sol.hasAlternatingBits(n));
    }
}
