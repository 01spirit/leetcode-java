package 错误的集合;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        int repeat=0;
        int loss=0;
        Arrays.sort(nums);

        //排序遍历
        /*for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                repeat=nums[i];
            }
            if(nums[i]-nums[i-1]==2){
                loss=nums[i]-1;
            }
        }

        if(loss==0){
            if(nums[0]==1){
                loss=nums.length;
            }
            else{
                loss=1;
            }
        }*/

        //哈希表
        //效率差很多
        //遍历存入表中，再从表中遍历一次，两次遍历，前面的方法只需要一次。
        Map<Integer , Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=1;i<=nums.length;i++){
            int cnt=0;
            cnt=map.getOrDefault(i,0);
            if(cnt==2){
                repeat=i;
            }
            if(cnt==0){
                loss=i;
            }
        }


        int[] res=new int[2];
        res[0]=repeat;
        res[1]=loss;

        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={2,3,2};
        System.out.println(Arrays.toString(sol.findErrorNums(nums)));
    }
}
