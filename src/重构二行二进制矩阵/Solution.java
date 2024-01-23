package 重构二行二进制矩阵;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<Integer> upList=new ArrayList<>();
        List<Integer> lwList=new ArrayList<>();
        List<List<Integer>> resList=new ArrayList<>();
        resList.add(upList);
        resList.add(lwList);

        int sum=0;
        int two=0;
        for(int num:colsum){
            sum+=num;
            if(num==2){
                two+=1;
            }
        }
        if(sum!=(upper+lower)||two>Math.min(upper,lower)){
            return new ArrayList<>();
        }
        for(int i=0;i<colsum.length;i++){
            if(colsum[i]==2){
                upList.add(1);
                upper--;
                lwList.add(1);
                lower--;
            }
            else if(colsum[i]==0){
                upList.add(0);
                lwList.add(0);
            }else{
                if(upper<=lower){
                    upList.add(0);
                    lwList.add(1);
                    lower--;
                }
                else{
                    upList.add(1);
                    upper--;
                    lwList.add(0);
                }
            }

        }
//        System.out.println(lower);

        return resList;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int upper= 5;
        int lower= 5;
        int[] colsum={2,1,2,0,1,0,1,2,0,1};
        System.out.println(Arrays.toString(sol.reconstructMatrix(upper,lower,colsum).toArray()));
    }

}
