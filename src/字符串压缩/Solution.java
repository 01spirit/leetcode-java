package 字符串压缩;

public class Solution {
    public String compressString(String S){
        if(S.length()==0){
            return S;
        }
        StringBuffer ans=new StringBuffer();
        char ch=S.charAt(0);
        int cnt=1;
        for(int i=1;i<S.length();++i){
            if(S.charAt(i)==ch){
                cnt++;
            }
            else{
                ans.append(ch);
                ans.append(cnt);
                cnt=1;
                ch=S.charAt(i);
            }
        }
        ans.append(ch);
        ans.append(cnt);

        return ans.length()>=S.length()?S:ans.toString();
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String S="aabcccccaaa";

        System.out.println(sol.compressString(S));
    }
}
