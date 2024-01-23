package 全排列II;

import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums){
        Arrays.sort(nums);
        int depth=0;
        int len=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        Deque<Integer> path=new ArrayDeque<>();
        boolean[] used=new boolean[len];

        if(len==0){
            return res;
        }

        backTracking(nums,len,depth,res,path,used);

        return res;
    }

    private void backTracking(int[] nums,
                              int len,int depth,
                              List<List<Integer>> res,
                              Deque<Integer> path,
                              boolean[] used){
        if(depth==len){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i<len;i++){
            /*if(!used[i]){

                path.add(nums[i]);
                used[i]=true;

                backTracking(nums,len,depth+1,res,path,used);

                used[i]=false;
                path.removeLast();

            }*/

            if(used[i]||(i>0&&nums[i]==nums[i-1]&&!used[i-1])){
                continue;
            }
            path.add(nums[i]);
            used[i]=true;

            backTracking(nums,len,depth+1,res,path,used);

            used[i]=false;
            path.removeLast();


        }

    }

    public static void main(String[] args) {
        Solution sol=new Solution();
//        int[] nums={1,2,3};
        int[] nums={1,1,2};
        System.out.println(sol.permute(nums));
    }
}
