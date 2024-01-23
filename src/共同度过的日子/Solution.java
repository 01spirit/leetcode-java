package 共同度过的日子;

public class Solution {

    public final int[] DAYS=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

    public int calDays(String S){
        var s=S.toCharArray();
        int day=(s[3]-'0')*10+s[4]-'0';
        int month=(s[0]-'0')*10+s[1]-'0';
        for(int i=0;i<month-1;i++){
            day+=DAYS[i];
        }
        return day;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int left=calDays(arriveAlice.compareTo(arriveBob)>0?arriveAlice:arriveBob);
        int right=calDays(leaveAlice.compareTo(leaveBob)<0?leaveAlice:leaveBob);

        return Math.max(right-left+1,0);
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String arriveAlice="08-15";
        String leaveAlice="08-18";
        String arriveBob="08-16";
        String leaveBob="08-19";

        System.out.println(sol.countDaysTogether(arriveAlice,leaveAlice,arriveBob,leaveBob));
    }
}
