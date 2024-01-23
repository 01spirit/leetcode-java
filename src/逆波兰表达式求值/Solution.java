package 逆波兰表达式求值;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int evalRPN(String[] tokens) {
        int res=0;
        /*
        for(String str:tokens){
            System.out.println(isNumber(str));
        }*/
        Deque<Integer> stack=new LinkedList<>();
        for(String str:tokens){
            if(isNumber(str)){
//                System.out.println(Integer.parseInt(str));
                stack.push(Integer.parseInt(str));
            }
            else{
                int num1=stack.pop();
                int num2=stack.pop();
                switch (str){
                    case "+":
                        stack.push(num1+num2);
                        break;
                    case "-":
                        stack.push(num2-num1);//这里也要注意顺序
                        break;
                    case "*":
                        stack.push(num1*num2);
                        break;
                    case "/":
                        stack.push(num2/num1);
//                        System.out.println(num1/num2);//这里要注意两个数出栈的顺序,被除数是第二个出栈的
                        break;
                    default:
                }
            }
        }
        res=stack.pop();
        return res;
    }

    public boolean isNumber(String str){
        return !str.equals("+")&&!str.equals("-")&&!str.equals("*")&&!str.equals("/");
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String[] tokens={"4","3","-"};
        System.out.println(sol.evalRPN(tokens));
    }
}
