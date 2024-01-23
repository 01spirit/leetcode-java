package 总持续时间可被60整除的歌曲;

public class Solution {
    public int numPairsDivisibleBy60(int[] time){
        int[] cnt=new int[60];
        for(int t:time){
            cnt[t%60]++;
        }
        long res=0;
        for(int i=1;i<30;i++){
            res+=cnt[i]*cnt[60-i];
        }
        res+=(long)cnt[0]*(cnt[0]-1)/2+(long)cnt[30]*(cnt[30]-1)/2;
        return (int)res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] time={30,20,150,100,40};
        System.out.println(sol.numPairsDivisibleBy60(time));
    }
}
