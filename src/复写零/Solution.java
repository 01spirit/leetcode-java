package 复写零;

public class Solution {
    public void duplicateZeros(int[] arr) {
        int len=arr.length;
        if(len==1){
            return;
        }
        else{
            for(int i=0;i<len-1;i++){
                if(arr[i]==0){
                    int temp=arr[i+1];
                    i++;
                    arr[i]=0;
                    for(int j=len-1;j>i;j--){
                        arr[j]=arr[j-1];
                    }
                    if(i<len-1){
                        arr[i+1]=temp;
                    }

                }
            }
        }


        /*for(int num:arr){
            System.out.println(num);
        }*/
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] arr={0,2,4,5,0,0,1};
        sol.duplicateZeros(arr);

    }
}
