package 对数组执行操作;

public class Solution {
    public int[] applyOperations(int[] nums) {
        int len=nums.length;
        int[] res=new int[len];
        int index=0;
        if(len==1){
            res[0]=nums[0];
        }
        else if(len==2){
            if(nums[0]==nums[1]){
                res[0]=nums[0]*2;
            }
            else if(nums[0]==0&&nums[1]!=0){
                res[0]=nums[1];
            }
            else{
                res[0]=nums[0];
                res[1]=nums[1];
            }
        }
        else{
            for(int i=0;i<len-1;i++){
                if(nums[i]==nums[i+1]){
                    nums[i]*=2;
                    nums[i+1]=0;
                }
                if(nums[i]!=0){
                    res[index]=nums[i];
                    index++;
                }
            }
        }
        if(len!=2&&nums[len-1]!=0){
            res[index]=nums[len-1];
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={2,1};
        int[] res=sol.applyOperations(nums);
        for(int num:res){
            System.out.println(num);
        }
    }
}
