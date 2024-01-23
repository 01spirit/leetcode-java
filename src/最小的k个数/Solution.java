package 最小的k个数;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res=new int[k];
        int key=arr[0];
        for(int j=1;j<arr.length;j++){
            int i=j-1;
            key=arr[i+1];
            while(i>=0&&arr[i]>key){
                arr[i+1]=arr[i];
                i-=1;
            }
            arr[i+1]=key;
        }
       /* for(int num:arr){
            System.out.println(num);
        }*/
        for(int i=0;i<k;i++){
            res[i]=arr[i];
//            System.out.println(res[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] arr={3,2,1};
        int k=2;
        int[] res=sol.getLeastNumbers(arr,k);
        for(int num:res){
            System.out.println(num);
        }

    }
}
