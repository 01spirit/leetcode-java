package 完成所有工作的最短时间;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int minimumTimeRequired(int[] jobs, int k) {
        Arrays.sort(jobs);
        int low=0,high=jobs.length-1;
        while(low<high){
            int temp=jobs[low];
            jobs[low]=jobs[high];
            jobs[high]=temp;
            low++;
            high--;
        }
        int l=jobs[0],r=Arrays.stream(jobs).sum();
        while(l<r){
            int mid=(l+r)>>1;
            if(check(jobs,k,mid)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }

        return l;
    }
    public boolean check(int[] jobs,int k,int limit){
        int[] workloads=new int[k];
        return backtrack(jobs,workloads,0,limit);
    }
    public boolean backtrack(int[] jobs,int[] workloads,int i,int limit){
        if(i>=jobs.length){
            return true;
        }
        int cur=jobs[i];
        for(int j=0;j<workloads.length;j++){
            if(workloads[j]+cur<=limit){
                workloads[j]+=cur;
                if(backtrack(jobs,workloads,i+1,limit)){
                    return true;
                }
                workloads[j]-=cur;
            }
            if(workloads[j]==0||workloads[j]+cur==limit){
                break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] jobs={3,2,3};
        int k= 3;
        System.out.println(sol.minimumTimeRequired(jobs,k));
    }
}
