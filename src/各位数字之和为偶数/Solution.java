package 各位数字之和为偶数;

public class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=2;i<=num;i++){
            int sum=0;
            int tmp=i;
            while(tmp!=0){
                int re=tmp%10;
                sum+=re;
                tmp/=10;
            }
            if(sum%2==0&&sum!=0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int num=30;
        System.out.println(sol.countEven(num));
    }
}
