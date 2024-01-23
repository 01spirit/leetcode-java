package 具有给定数值的最小字符串;

public class Solution {
    public String getSmallestString(int n, int k) {
        StringBuffer sb=new StringBuffer();
//        System.out.println((char)('a'+25));
        int[] nums=new int[n];
        int nk=k-n;
        for(int i=0;i<n;i++){
            if(nk>=25){
                nums[i]=25;
                nk-=25;
            }
            else{
                nums[i]=nk;
                break;
            }
        }

        for(int num:nums){
//            System.out.println(num);
            sb.append((char)('a'+num));
        }


        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int n= 5;
        int k= 73;
        System.out.println(sol.getSmallestString(n,k));
    }
}
