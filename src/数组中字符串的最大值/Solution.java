package 数组中字符串的最大值;

public class Solution {
    public int maximumValue(String[] strs) {
        int maxVal=0;
        int val=0;
        for(String str:strs){
            val=str.length();
            int index=0;
            while(index<val&&!Character.isLetter(str.charAt(index))){
                index++;
            }
            if(index==val){
                val=Integer.parseInt(str);
            }
            maxVal=Math.max(maxVal,val);
        }

        return maxVal;
    }
    public static void main(String[] args){
        Solution sol=new Solution();
        String[] strs={"1","01","001","0001"};
        System.out.println(sol.maximumValue(strs));
    }
}
