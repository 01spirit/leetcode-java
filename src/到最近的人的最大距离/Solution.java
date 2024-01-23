package 到最近的人的最大距离;

public class Solution {
    public int maxDistToClosest(int[] seats) {
        int num=0;
        int dis=0;
        boolean left=false,right=false;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==0){
                num++;
                right=false;
            }
            else {
                if(!left){
                    dis=Math.max(dis,num);
                    num=0;
                    left=true;
                }
                else{
                    dis=Math.max((num+1)/2,dis);
                    num=0;
                    right=true;
                }
            }
        }
        if(!right){
            dis=Math.max(dis,num);
        }
        return dis;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] seats={1,0,0,1};
        System.out.println(sol.maxDistToClosest(seats));
    }
}
