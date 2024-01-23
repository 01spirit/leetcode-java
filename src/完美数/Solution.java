package 完美数;

public class Solution {
    public boolean checkPerfectNumber(int num) {
        boolean pn=false;
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
//                System.out.println(i);
            }
        }
        if (num == sum) {
            pn=true;
        }
        return pn;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int num=7;
        System.out.println(solution.checkPerfectNumber(num));
    }
}
