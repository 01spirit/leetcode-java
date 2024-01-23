package 老人的数目;

public class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;

        /*for(String detail:details){
            String ageS=detail.substring(11,13);
            int ageI=Integer.parseInt(ageS);
            System.out.println(ageS);
            if (ageI > 60) {
                cnt++;
            }
        }*/

        //速度更快
        for(String detail:details){
            if(detail.charAt(11)=='6' && detail.charAt(12)>'0' || detail.charAt(11)>'6'){
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String[] details={
                "7868190130M7522","5303914400F9211","9273338290F4010"
        };
        System.out.println(sol.countSeniors(details));
    }
}
