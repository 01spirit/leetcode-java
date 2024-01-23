package 全零子数组数目;

public class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt=0;
        long res=0;
        for(int num:nums){
            if(num==0){
                cnt+=1;
            }
            else{
                res+=((cnt*(cnt+1))/2);
                cnt=0;
            }
        }
        res+=cnt*(cnt+1)/2;
        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={0,0,0,2,0,0};
        System.out.println(sol.zeroFilledSubarray(nums));
    }
}
