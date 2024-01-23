package 螺旋矩阵;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int up=0,down=matrix.length-1,left=0,right=matrix[0].length-1;
        int upTemp=0,downTemp=matrix.length-1,leftTemp=0,rightTemp=matrix[0].length-1;
        int cnt=0;

        while(left<=right&&up<=down){
            while(leftTemp<=right){
                ans.add(matrix[up][leftTemp]);
                leftTemp++;cnt++;
            }
            upTemp++;
            while(upTemp<=down){
                ans.add(matrix[upTemp][right]);
                upTemp++;cnt++;
            }
            if(left<right&&up<down){
                rightTemp--;
                while(rightTemp>=left){
                    ans.add(matrix[down][rightTemp]);
                    rightTemp--;cnt++;
                }
                downTemp--;
                while(downTemp>up){
                    ans.add(matrix[downTemp][left]);
                    downTemp--;cnt++;
                }
            }

//            ans.remove(ans.size()-1);
            up++;left++;down--;right--;
            upTemp=up;leftTemp=left;downTemp=down;rightTemp=right;
        }


        return ans;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
//        int[][] matrix={{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] matrix={{1, 2, 3},{
            4, 5, 6
        },{
            7, 8, 9
        }};
        System.out.println(sol.spiralOrder(matrix));
    }
}
