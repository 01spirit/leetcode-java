package 相等行列对;

public class Solution {
    public int equalPairs(int[][] grid) {
        int cnt=0;
        int len= grid.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(equal(i,j,grid)){
                    cnt++;
                }
            }
        }

        return cnt;
    }
    public boolean equal(int i,int j,int[][] grid){
        for(int k=0;k<grid.length;k++){
            if(grid[i][k]!=grid[k][j]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[][] grid={{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        System.out.println(sol.equalPairs(grid));
    }
}
