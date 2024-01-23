package 打印n位数;

public class Solution {
    public int[] printNumbers(int n) {
        int num=10;
        for(int i=1;i<n;i++){
            num*=10;
        }
//        System.out.println(num);
        int[] nums=new int[num];
        for(int i=1;i<num;i++){
            nums[i]=i;
//            System.out.println(nums[i]);
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n=3;
        System.out.println(sol.printNumbers(n));


    }
}
