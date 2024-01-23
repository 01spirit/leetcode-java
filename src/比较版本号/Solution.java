package 比较版本号;

public class Solution {
    public int compareVersion(String version1, String version2){
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        /*for(String s:v2){
            System.out.println(s);
        }*/
        int len1=v1.length;
        int len2=v2.length;
        for(int i=0;i<len1||i<len2;i++){
            int x=0,y=0;
            if(i<len1){
                x=Integer.parseInt(v1[i]);
//                System.out.println(x);
            }
            if(i<len2){
                y=Integer.parseInt(v2[i]);
            }
            if(x<y){
                return -1;
            }
            if(x>y){
                return 1;
            }
        }

        return  0;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String version1="0.1";
        String version2="1.0.1";
        System.out.println(sol.compareVersion(version1,version2));
    }
}
