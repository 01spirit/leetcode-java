package 组合总数;

import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> tmp=new ArrayList<>();

        backTrack(candidates,target,0,res,tmp);


        return res;
    }

    public void backTrack(int[] candidates,int target,int sum,List<List<Integer>> res,List<Integer> tmp){
        if(sum>target){
            return;
        }
        if(sum==target){
            List<Integer> ttmp=new ArrayList<>(tmp);
            Integer[] nums= ttmp.toArray(new Integer[0]);
            Arrays.sort(nums);
            ttmp=new ArrayList<>(List.of(nums));
            if(res.contains(ttmp)){
                return;
            }
            res.add(ttmp);
            sum=0;
            return;
        }

        for(int i=0;i<candidates.length;i++){
//            sum+=candidates[i];
            tmp.add(candidates[i]);
            backTrack(candidates,target,sum+candidates[i],res,tmp);//
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] candidates ={1,2,3,4,5,6,7} ;//{2, 3, 5}
        int target = 5;
        System.out.println(sol.combinationSum(candidates,target));
    }
}
