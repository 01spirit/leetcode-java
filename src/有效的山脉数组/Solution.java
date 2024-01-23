package 有效的山脉数组;

public class Solution {
    public boolean validMountainArray(int[] arr) {
        int flagl=0;
        if(arr.length<3){
            return false;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]>0&&i+1!=arr.length-1){
                flagl=i+1;
            }
            else if(arr[i+1]-arr[i]>0&&i+1==arr.length-1){
                return false;
            }
            else if(arr[i+1]-arr[i]<=0){
                break;
            }

        }
//        System.out.println("left:"+flagl);
        int flagr=arr.length-1;
        for(int j=arr.length-1;j>0;j--){
            if(arr[j]-arr[j-1]<0&&j-1!=0){
                flagr=j-1;
            }
            else if(arr[j]-arr[j-1]<0&&j-1==0){
                return false;
            }
            else if(arr[j]-arr[j-1]>=0){
                break;
            }

        }
//        System.out.println("right"+flagr);
        if(flagl==flagr){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] arr={1,1,1,1,1,1,1,2,1};
        System.out.println(sol.validMountainArray(arr));
    }
}
