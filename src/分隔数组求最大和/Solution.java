package 分隔数组求最大和;

public class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k){
        int len=arr.length;
        int [] d=new int[len+1];

        for(int i=1;i<len+1;i++){
            int maxValue=arr[i-1];

            for(int j=i-1;j>=0&&j>=i-k;j--){
                d[i]=Math.max(d[i],d[j]+maxValue*(i-j));
                if(j>0){
                    maxValue=Math.max(maxValue,arr[j-1]);
                }
            }
        }

        return d[len];
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] arr={1,15,7,9,2,5,10};
        int k=3;

        int d=sol.maxSumAfterPartitioning(arr,k);
        System.out.println(d );
    }

}
