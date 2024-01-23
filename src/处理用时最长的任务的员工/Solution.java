package 处理用时最长的任务的员工;

public class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int maxTime=logs[0][1];
        int id=logs[0][0];
        if(logs.length==1){
            return maxTime;
        }
        for(int i=1;i<logs.length;i++){
            if(logs[i][1]-logs[i-1][1]>maxTime){
                    id=logs[i][0];
                    maxTime=logs[i][1]-logs[i-1][1];
//                System.out.println(maxTime);
            }
            else if(logs[i][1]-logs[i-1][1]==maxTime){
                if(logs[i][0]<id){
                    id=logs[i][0];
                }
            }
        }
        return id;
    }

    public static void main(String[] args) {
        int n=2;
        int[][] logs={{0, 3}, {2, 5}, {0, 9}, {1, 15}};
        Solution sol=new Solution();
        System.out.println(sol.hardestWorker(n,logs));
    }
}
