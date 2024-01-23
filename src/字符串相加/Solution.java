package 字符串相加;

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder=new StringBuilder();
        int up=0;
        int first=num1.length(),second=num2.length();
        for(int i=num1.length()-1,j=num2.length()-1;i>=0&&j>=0;i--,j--){
            char ch1=num1.charAt(i);first--;
            char ch2=num2.charAt(j);second--;
            int sum=(ch1-'0')+(ch2-'0')+up;
            if(sum>=10){
                up=1;
                sum-=10;
            }else{
                up=0;
            }
            stringBuilder.append((char) (sum+'0'));
        }

        while(first!=0){
            int sum=(num1.charAt(first-1))-'0'+up;
            first--;
            if(sum>=10){
                up=1;
                sum-=10;
            }else{
                up=0;
            }
//            System.out.println((char) (sum+'0'));
            stringBuilder.append((char) (sum+'0'));
        }
        while(second!=0){
            int sum=(num2.charAt(second-1))-'0'+up;
            second--;
            if(sum>=10){
                up=1;
                sum-=10;
            }else{
                up=0;
            }
//            System.out.println((char) (sum+'0'));
            stringBuilder.append((char) (sum+'0'));
        }

        if(up!=0){
            stringBuilder.append((char) (up+'0'));
        }

        /*
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
         */

        return stringBuilder.reverse().toString();

    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String num1 = "6", num2 = "501";
        System.out.println(sol.addStrings(num1,num2));
    }
}
