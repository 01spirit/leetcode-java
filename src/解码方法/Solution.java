package 解码方法;

public class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[] cnt=new int[n+1];
        cnt[0]=1;
        for(int i=1;i<=n;++i){
            if(s.charAt(i-1)!='0'){
                cnt[i]+=cnt[i-1];
            }
            if(i>1&&s.charAt(i-2)!='0'&&((s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0')<=26)){
                cnt[i]+=cnt[i-2];
            }

        }
        return cnt[n];
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="06";
        System.out.println(sol.numDecodings(s));
    }
}
