package 找出中枢整数;

public class Solution {
    public int pivotInteger(int n) {
        int left=1,right=n;
        int leftSum=0,rightSum=0;
        if(n==1){
            return 1;
        }
        while(left<=right){

            if(leftSum==0||leftSum<rightSum){
                leftSum+=left;
//                System.out.println("l:"+leftSum);
                left++;
            }
            else{
                rightSum+=right;
//                System.out.println("r:"+rightSum);
                right--;
            }
            if(left==right&&leftSum==rightSum){
                return left;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n= 8;
        System.out.println(sol.pivotInteger(n));
    }
}
