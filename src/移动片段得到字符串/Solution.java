package 移动片段得到字符串;

public class Solution {
    public boolean canChange(String start, String target) {
        int n=start.length();
        int i=0,j=0;
        while (i < n && j < n) {
            while(i<n&&start.charAt(i)=='_'){
                i++;
            }
            while (j<n&&target.charAt(j) == '_') {
                j++;
            }
            if(i<n&&j<n){
                if(start.charAt(i)==target.charAt(j)){
                    if(start.charAt(i)=='L'){
                        if(i<j){
                            return false;
                        }
                    }
//                if(start.charAt(i)=='R')
                    else{
                        if(i>j){
                            return false;
                        }
                    }
                }
                else{
                    return false;
                }
                i++;j++;
            }
        }
        while(i<n){
            if(start.charAt(i)!='_'){
                return false;
            }
            i++;
        }
        while (j < n) {
            if(target.charAt(j)!='_'){
                return false;
            }
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String start = "__", target = "__";
        System.out.println(sol.canChange(start,target));
    }
}
