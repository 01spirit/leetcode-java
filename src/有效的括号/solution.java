package 有效的括号;

import java.util.LinkedList;

public class solution {
    public boolean isValid(String s) {
        LinkedList<Character> ll=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){//获取索引处元素
                ll.addLast(')');//在linkedlist尾部添加元素
            }
            else if(s.charAt(i)=='['){
                ll.addLast(']');
            }
            else if(s.charAt(i)=='{'){
                ll.addLast('}');
            }
            else if(ll.isEmpty()||s.charAt(i)!=ll.removeLast()){//removeLast方法:删除并返回linkedlist尾部的元素
                return false;
            }
            //遇到左括号时在ll尾部加入要匹配的右括号，遇到右括号时从ll尾部移除并返回当前期望匹配的右括号，若不相等则不匹配
        }
        return ll.isEmpty();
    }

    public static void main(String[] args){
        solution sol=new solution();
        String s="{}[[]";
        System.out.println(sol.isValid(s));
    }

}
