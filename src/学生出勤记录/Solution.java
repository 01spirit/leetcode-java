package 学生出勤记录;

public class Solution {
    public boolean checkRecord(String s) {
        char[] chars=s.toCharArray();
        int countA=0;
        int countL=0;
        int maxCountL=0;
        for(char ch:chars){
//            System.out.println(ch);
            if('A'==ch){
                countA++;
                countL=0;
            }
            else if('L'==ch){
                countL++;
                maxCountL=Math.max(maxCountL,countL);
            }
            else{
                countL=0;
            }
        }

        if(countA<2&&maxCountL<3){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="PPALLL";
        System.out.println(sol.checkRecord(s));
    }
}
