package 反转字符串;

import java.util.Arrays;

public class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        if(n<=1){
            return;
        }
        for(int i=0,j=n-1;i<j;i++,j--){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        char[] s = {'h', 'e', 'l', 'l', 'o','v'};//
        sol.reverseString(s);
    }
}
