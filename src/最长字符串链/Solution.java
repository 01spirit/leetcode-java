package 最长字符串链;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestStrChain(String[] words){
        Map<String,Integer> count=new HashMap<String,Integer>();
        Arrays.sort(words,(a,b) -> a.length()-b.length());
        int res=0;

//        for(String word:words){
//            count.put(word,1);
//        }

        for(String word:words){
            count.put(word,1);
//            System.out.println(word);
//            System.out.println(word.substring(2));
            for(int i=0;i<word.length();i++){
                String pre=word.substring(0,i)+word.substring(i+1);//去掉第i个字符的子串
//                System.out.println(pre);
                if(count.containsKey(pre)){
                    count.put(word,Math.max(count.get(word),count.get(pre)+1));
//                    System.out.println(count.get(word));
                }

                res=Math.max(res,count.get(word));


            }



        }


        return res;
    }

    public static void main(String[] args) {
        String[] words={"xbc","pcxbcf","xb","cxbc","pcxbc"};
        Solution sol=new Solution();

        System.out.println(sol.longestStrChain(words));
    }


}
