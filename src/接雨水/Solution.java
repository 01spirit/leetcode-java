package 接雨水;

public class Solution {
    public int trap(int[] height) {


        int len=height.length;
        int count=0;
        int left=0,right=len-1;
        int leftMax=0,rightMax=0;

        while(left<right){
            leftMax=Math.max(leftMax,height[left]);
            rightMax=Math.max(rightMax,height[right]);
            if(leftMax<rightMax){
                count+=leftMax-height[left];
                left++;
            }
            else{
                count+=rightMax-height[right];
                right--;
            }
        }

        return count;
    }

    public static void main(String[] args){
        Solution sol=new Solution();
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.print(sol.trap(height));
    }

}
