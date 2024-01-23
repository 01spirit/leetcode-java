package 全排列;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Simulate {
    public List<List<Integer>> permute(int[] nums){
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
            if(!used[i]){
                path.add(nums[i]);
                used[i]=true;

                backTracking(nums,len,depth+1,res,path,used);

                used[i]=false;
                path.removeLast();

            }
        }

    }

    public static void main(String[] args) {
        Simulate sol=new Simulate();
//        int[] nums={1,2,3};
        int[] nums={1,2,3,4};
        System.out.println(sol.permute(nums));
    }
}
