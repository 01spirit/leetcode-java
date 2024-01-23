package 执行操作后的最大MEX;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int res=0;
        Map<Integer,Integer> cnt=new HashMap<>();
        for(int i=0;i<value;i++){
            cnt.put(i,0);
        }
        for(int num:nums){
            if(num>=0){
                cnt.put(num%value, cnt.get(num%value)+1);
            }
            else{
                if(Math.abs(num)%value==0){
                    cnt.put(0,cnt.get(0)+1);
                }
                else{
                    int temp=  value - Math.abs(num) % value;
                    cnt.put(temp,cnt.get(temp)+1);
                }
            }
        }
        int time=0;
        while(true){
            for(int i=0;i<value;i++){
                if(cnt.get(i)==0){
                    res=i+time*value;
                    return res;
                }
                cnt.put(i,(cnt.get(i)-1));
            }
            time++;
        }

//        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={3,0,3,2,4,2,1,1,0,4};
        int value= 5;
        System.out.println(sol.findSmallestInteger(nums,value));
    }
}
