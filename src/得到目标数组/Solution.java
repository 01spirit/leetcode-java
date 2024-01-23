package 得到目标数组;


//主要看循环逻辑的控制
public class Solution {
    public int minOperations(int[] nums) {
        boolean[] isZero=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            isZero[i]=false;
            if(nums[i]==0)
                isZero[i]=true;
        }
        int count=0;

        for(int j=0;j<nums.length;j++){
            while(!isZero[j]){
                for(int i=0;i<nums.length;i++){
                    if(!isZero[i]){
                        if(nums[i]==1){
                            nums[i]-=1;
                            isZero[i]=true;
                            count++;
                        }
                        else if(nums[i]%2==1){
                            nums[i]-=1;
                            count++;
                        }
                    }
                }
                if(isZero[j]){
                    break;
                }
                else{
                    int tmp=0;
                    for(int k=0;k<nums.length;k++){
                        if(!isZero[k]){
                            nums[k]/=2;
                            tmp++;
                        }
                    }
                    if(tmp!=0){
                        count++;
                    }
                }

            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={4,2,5};
        System.out.println(sol.minOperations(nums));
    }
}
