package 寻找重复数;

public class Solution {
    public int findDuplicate(int[] nums){
        int len=nums.length;
        int ans=-1;
        int left=1,right=len-1;
        while(left<right){
            int cnt=0;
            int mid=(left+right)/2;
            for(int i=0;i<len;i++){
                if(nums[i]<=mid){
                    cnt++;
                }
            }
            if(cnt<=mid){
                left=mid+1;
            }
            else{
                right=mid-1;
                ans=mid;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={1,3,4,2,2};
        System.out.println(sol.findDuplicate(nums));
    }
}
