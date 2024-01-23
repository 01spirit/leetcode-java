package 山脉数组的峰顶索引;

public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0,right=arr.length-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(left==0&&arr[0]>arr[1]){
                return 0;
            }
            else if(right==arr.length-1&&arr[right-1]<arr[right]){
                return right;
            }
            else{
                if(arr[mid-1]<arr[mid]){
                    if(arr[mid]>arr[mid+1]){
                        return mid;
                    }
                    else{
                        left=mid;
                    }
                }
                if(arr[mid-1]>arr[mid]){
                    right=mid;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] arr={1,2,3,4,2,1};
        System.out.println(sol.peakIndexInMountainArray(arr));
    }
}
