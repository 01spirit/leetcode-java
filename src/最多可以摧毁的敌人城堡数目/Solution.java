package 最多可以摧毁的敌人城堡数目;

public class Solution {
    public int captureForts(int[] forts) {
        int res=0,count=0;
        boolean pos=false,neg=false,cmp=false;
        for(int num:forts){
            if(num==-1){
                if(neg){
                    count=0;
                    continue;
                }
                neg=true;
                if(pos){
                    res=Math.max(res,count);
                    pos=false;
                    count=0;
                }
            }
            else if(num==1){
                if(pos){
                    count=0;
                    continue;
                }
                pos=true;
                if(neg){
                    res=Math.max(res,count);
                    neg=false;
                    count=0;
                }
            }
            else{
                if(pos||neg){
                    count++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] forts={1,0,0,-1,0,0,-1,0,0,1};
        System.out.println(sol.captureForts(forts));
    }
}
