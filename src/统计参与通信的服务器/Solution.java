package 统计参与通信的服务器;

public class Solution {
    public int countServers(int[][] grid) {
        int res=0;
        int row=grid.length;
        int col=grid[0].length;
        boolean[][] con=new boolean[row][col];

        for(int i=0;i<row;i++){
            int num=0;
            int index=0;
            for(int j=0;j<col;j++){
                if(grid[i][j]==1&&num==0){
                    index=j;
                    num++;
                }
                else if(grid[i][j]==1&&num>0){
                    num++;
                    con[i][j]=true;
                    con[i][index]=true;
                }
            }
            if(num>1){
                res+=num;
            }
        }

        for(int i=0;i<col;i++){
            int num=0;
            int neg=0;
            for(int j=0;j<row;j++){
                if(grid[j][i]==1){
                    num++;
                    if(!con[j][i]){
                        neg++;
                    }
                }
            }
            if(num>1){
                res+=neg;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
//        int[][] grid={{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        int [][] grid={{1, 0},{
            0, 1
        }};
        System.out.println(sol.countServers(grid));
    }
}
