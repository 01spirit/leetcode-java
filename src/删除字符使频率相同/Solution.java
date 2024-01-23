package 删除字符使频率相同;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


//面向结果编程
public class Solution {
    public boolean equalFrequency(String word) {
        char[] ch=word.toCharArray();
        Map<Character,Integer> count=new HashMap<Character,Integer>();
        for(char c:ch){
            count.put(c,count.getOrDefault(c,0)+1);
        }

        int num=0;
        int sum=0;
        int[] values=new int[100];
        for(Map.Entry<Character,Integer> entry:count.entrySet()){
//            System.out.println(entry.getValue());
            values[num]=entry.getValue();
//            sum+=entry.getValue();
            num++;
        }

        int[] newValues=new int[num];
        for(int i=0;i<num;i++){
            newValues[i]=values[i];
//            System.out.println(newValues[i]);
        }
        Arrays.sort(newValues);


        if(num==1){
            return true;
        }
        else if(num==2){
            if(newValues[1]==1||newValues[0]==1||newValues[1]-newValues[0]==1){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            for(int i=0;i<num-2;i++){
                if(newValues[0]==1&&newValues[1]==newValues[num-1]){
                    return true;
                }
                else if(newValues[i]-newValues[i+1]!=0){
//                System.out.println(newValues[i]);
                    return false;
                }
            }
            if(newValues[num-1]!=1&&newValues[num-1]-newValues[num-2]!=1){
                return false;
            }
        }


//        System.out.println(newValues[3]);
        return true;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String word="aaaabbbbccc";
        System.out.println(sol.equalFrequency(word));
    }
}
