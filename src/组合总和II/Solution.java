package 组合总和II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> tmp=new ArrayList<>();
        int sum=0;

        backTrack(res,tmp,candidates,target,sum,0);

        return res;
    }

    public void backTrack(List<List<Integer>> res,List<Integer> tmp,int[] candidates,int target,int sum,int index){
        if(sum>target){
            return;
        }
        if(sum==target){
            List<Integer> ttmp=new ArrayList<>(tmp);
            Integer[] nums=ttmp.toArray(new Integer[0]);
            Arrays.sort(nums);
            ttmp=new ArrayList<>(List.of(nums));
            if(!res.contains(ttmp)){
                res.add(ttmp);
            }

            sum=0;
            return;
        }

        for(int i=index;i< candidates.length;i++){

            if(i>index&&i<candidates.length-1&&candidates[i]==candidates[i+1]){
                continue;
            }
            tmp.add(candidates[i]);
            backTrack(res,tmp,candidates,target,sum+candidates[i],i+1);
            tmp.remove(tmp.size()-1);
        }

    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[]candidates = {2, 5, 2, 1, 2};
        int target = 5;
        System.out.println(sol.combinationSum2(candidates,target));
    }
}
