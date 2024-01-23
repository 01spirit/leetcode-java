package 数字的美丽值;

public class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        int numOri=num;
        int[] sngNum=new int[10];
        int len=0;

        while(num>0){
            sngNum[len]=num%10;
            num/=10;
            len++;

        }

        int right=len;
        int temp=0;
        for(int i=right-1;i>=k-1;i--){
            for(int j=i;j>i-k;j--){
                temp*=10;
                temp+=sngNum[j];

            }
            if(temp!=0&&(numOri%temp==0)){
                count++;
                //System.out.println(temp);
            }
            temp=0;
        }


        return count;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int num=240;
        int k=2;

        System.out.println(sol.divisorSubstrings(num,k));

    }
}
