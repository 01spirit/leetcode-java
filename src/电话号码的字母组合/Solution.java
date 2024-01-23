package 电话号码的字母组合;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        String[] letters={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int len=digits.length();

        StringBuilder stringBuilder=new StringBuilder();

        if(len==0){
            return res;
        }

        backTrack(letters,res,digits,0,stringBuilder);

        return res;
    }

    public void backTrack(String[] letters,List<String> res,String digits,int index,StringBuilder stringBuilder){
        if(index==digits.length()){
            res.add(stringBuilder.toString());
        }
        else{
            int digit=digits.charAt(index)-'0';
            String letter=letters[digit];
            for(int i=0;i<letter.length();i++){
                stringBuilder.append(letter.charAt(i));
                backTrack(letters,res,digits,index+1,stringBuilder);
                stringBuilder.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String digits="27";
        System.out.println(sol.letterCombinations(digits));
    }
}
