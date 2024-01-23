package 单调递增的数字;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int monotoneIncreasingDigits(int n) {
        List<Integer> lnums=new ArrayList<>();
        int count=0;
        while(n>0){
            lnums.add(n%10);
            n/=10;
            count++;
        }
        Integer[] nums=lnums.toArray(new Integer[count]);

        /*for(int num:nums){
            System.out.println(num);
        }*/

        if(count==0){
            return 0;
        }
        if(count==1){
            return nums[0];
        }
        if(count>2&&nums[count-1]!=9){
            for(int j=count-2;j>0;j--){
                if(nums[j]==9){
                    nums[j]-=1;
                    for(int k=j-1;k>=0;k--){
                        nums[k]=9;
                    }
                    break;
                }
            }
        }

        while(!isIncrease(nums)){
            for(int i=0;i<count-1;i++){
                if(nums[i]<nums[i+1]&&nums[i+1]!=0&&nums[i+1]!=9){
                    nums[i]=9;
                    nums[i+1]-=1;
                }
                else if((i+2)!=count&&nums[i+1]==0){
                    nums[i]=9;
                    nums[i+1]=9;
                    nums[i+2]-=1;
                }
                else if((i+1)<count&&nums[i+1]==9){
                    if(i+2==count){
                        nums[i+1]-=1;
                    }
                    nums[i]=9;

                }
            }
        }


        int res=0;
        for(int i=count-1;i>=0;i--){
            res*=10;
            res+=nums[i];
        }

        return res;
    }

    public boolean isIncrease(Integer[] nums){
        if(nums.length<=1){
            return true;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1]>nums[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n=0;
        System.out.println(sol.monotoneIncreasingDigits(n));
    }
}
