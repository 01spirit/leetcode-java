package 二进制求和;

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();

        char[] na=a.toCharArray();
        char[] nb=b.toCharArray();

        int al=na.length;
        int bl=nb.length;

        //列竖式，模拟加法，先计算两字符串共有的数位，然后把某一字符串的剩余数位加入，中间需要注意进位问题，结束后根据进位决定是否新增一位1
        char plus='0';
        while(al!=0 && bl!=0){
            al--;
            bl--;
            if(na[al]=='1' && nb[bl]=='1'){
                if(plus=='0'){
                    sb.append('0');
                }
                else{
                    sb.append('1');
                }
                plus='1';
            }
            else if(na[al]=='1' && nb[bl]=='0' || na[al]=='0' && nb[bl]=='1'){
                if(plus=='0'){
                    sb.append('1');
                }
                else{
                    sb.append('0');
                }
            }
            else{
                if(plus=='0'){
                    sb.append('0');
                }
                else{
                    sb.append('1');
                }
                plus='0';
            }
        }

//        System.out.println(al);
//        System.out.println(bl);

        if(al!=0){
//            System.out.println("al");
            for(int i=al-1;i>=0;i--){
//                System.out.println(na[i]);
                if(plus=='0'){
                    sb.append(na[i]);
                }
                else{
                    if(na[i]=='1'){
                        sb.append('0');
                        plus='1';
                    }
                    else{
                        sb.append('1');
                        plus='0';
                    }
                }
            }
        }


        if(bl!=0){
//            System.out.println("bl");
            for(int i=bl-1;i>=0;i--){
                if(plus=='0'){
                    sb.append(nb[i]);
                }
                else{
                    if(nb[i]=='1'){
                        sb.append('0');
                        plus='1';
                    }
                    else{
                        sb.append('1');
                        plus='0';
                    }
                }
            }
        }

        if(plus=='1'){
            sb.append('1');
//            System.out.println("plus");
        }


        //列竖式，更简单的版本
        /*int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();*/




        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String a="1";
        String b="111";
        System.out.println(sol.addBinary(a,b));
    }
}
