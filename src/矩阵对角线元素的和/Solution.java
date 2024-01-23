package 矩阵对角线元素的和;

public class Solution {
    public int diagonalSum(int[][] mat) {
        int col=mat.length;
        int sum=0;

        for(int i=0;i<col;i++){
            sum+=mat[i][i];
        }

        if(col%2==1){
            sum-=mat[(col-1)/2][(col-1)/2];
        }

        for(int i=0,j=col-1;i<col;i++,j--){
            sum+=mat[j][i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        /*int[][] mat={{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};*/
        int[][] mat={{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        System.out.println(sol.diagonalSum(mat));
    }
}
