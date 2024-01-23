package 可被三整除的偶数的平均值;

public class Solution {
    public int averageValue(int[] nums) {
        int avg=0;
        int count=0;
        int sum=0;
        for(int num:nums){
            if(num%2==0&&num%3==0){
                count++;
                sum+=num;
            }
        }
        if(sum==0){
            return 0;
        }
        avg=sum/count;
        return avg;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={1,2,4,7,10};
        System.out.println(sol.averageValue(nums));
    }
}
