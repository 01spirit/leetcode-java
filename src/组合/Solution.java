package 组合;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> tmp=new ArrayList<>();

        backTrack(res,tmp,1,k,n);

        return res;
    }

    public void backTrack(List<List<Integer>> res,List<Integer> tmp,int index,int k,int n){
        if(tmp.size()==k){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for(int i=index;i<=n;i++){
            tmp.add(i);
            backTrack(res,tmp,i+1,k,n);
            tmp.remove(tmp.size()-1);
        }

    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n = 4, k = 2;
        System.out.println(sol.combine(n,k));
    }
}
