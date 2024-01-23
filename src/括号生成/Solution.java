package 括号生成;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n){
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        backTrack(ans,sb,0,0,n);

        return ans;
    }

    //回溯算法
    public void backTrack(List<String> ans,StringBuilder sb,int open,int close,int max){
        if(sb.length()==max*2){//到达叶子结点，向list加入string
            ans.add(sb.toString());
            return;
        }
        if(open<max){//左括号不够，继续加括号，然后回溯
            sb.append('(');
            backTrack(ans,sb,open+1,close,max);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            backTrack(ans,sb,open,close+1,max);
            sb.deleteCharAt(sb.length()-1);
        }

    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n= 3;
        for(String str:sol.generateParenthesis(n)){
            System.out.println(str);
        }
    }
}
