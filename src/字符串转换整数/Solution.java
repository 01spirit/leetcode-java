package 字符串转换整数;

public class Solution {
    public int myAtoi(String s) {
        boolean isNeg=false;
        long res=0;
        StringBuilder num=new StringBuilder();
        for(char ch:s.toCharArray()){
//            System.out.println();
            if(num.toString().isEmpty()){
                if(ch==' '){
                    continue;
                }
                else if(ch=='-'){
                    isNeg=true;
                    num.append(ch);
                    continue;
                }
                else if(ch=='+'){
                    num.append(ch);
                    continue;
                }
                else if(Character.isDigit(ch)){
                    num.append('+');
                    num.append(ch);
                    continue;
                }else{
                    break;
                }
            }
            else{
                if(Character.isDigit(ch)){
                    num.append(ch);
                    continue;
                }else{
                    break;
                }
            }
        }
        if(!num.toString().isEmpty()){
            num.deleteCharAt(0);
        }
        if(num.toString().isEmpty()){
            return 0;
        }

//        res=(isNeg?(-1):1)*Integer.parseInt(num.toString());
        res=(isNeg?(-1):1)*Long.parseLong(num.toString());



        return (int)res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="-91283472332";
        System.out.println(sol.myAtoi(s));
    }
}
