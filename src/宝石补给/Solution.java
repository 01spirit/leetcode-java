package 宝石补给;

import java.util.Arrays;

public class Solution {
    public int giveGem(int[] gem, int[][] operations) {
        int num=gem.length;
        int res=0;

        for(int i=0;i<operations.length;i++){
            int x=operations[i][0];
            int y=operations[i][1];
            int gnum=gem[x]/2;
            gem[x]-=gnum;
            gem[y]+=gnum;
        }

        int max=0,min=1001;
        for(int n:gem){
            max=Math.max(max,n);
            min=Math.min(min,n);
        }
        res=max-min;

//        Arrays.sort(gem);
//        res=gem[gem.length-1]-gem[0];
        //System.out.println((res+1)/2);

        return res;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] gem={0,2,5,4};
        int[][] operations={
                {3, 2},{
            3, 2
        },{
            1, 3
        },{
            0, 2
        },{
            3, 0
        },{
            3, 1
        },{
            0, 3
        },{
            2, 1
        },{
            3, 0
        }
        };
        System.out.println(sol.giveGem(gem,operations));

    }
}
