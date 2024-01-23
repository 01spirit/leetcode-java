package 只出现一次的数字;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i : nums){

//            count=count==null?1:(count+=1);
            map.put(i,map.getOrDefault(i,0)+1);

        }
//        for(int i : map.keySet()){
//            Integer count=map.get(i);
//            if(count==1){
//                return i;
//            }
//        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Solution sol=new Solution();
        int[] nums={2,2,3,2};

        System.out.print(sol.singleNumber(nums));
    }
}
