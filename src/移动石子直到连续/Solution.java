package 移动石子直到连续;

import java.util.Arrays;

public class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] nums={a,b,c};
        Arrays.sort(nums);
        /*for(int num:nums){
            System.out.println(num);
        }*/

        int minMoves=0;
        int maxMoves=0;

        maxMoves=nums[2]-nums[1]-1+nums[1]-nums[0]-1;
        if(maxMoves==0){
            minMoves=0;
        }
        else if(nums[2]-nums[1]<=2||nums[1]-nums[0]<=2){//有两枚石子连续放置或间隔为一，只需要把另一个石子移动过来
            minMoves=1;
        }
        else{
            minMoves=2;
        }

        int[] answer=new int[2];
        answer[0]=minMoves;
        answer[1]=maxMoves;

        return answer;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        int a=3;
        int b=5;
        int c=1;

        int[] answer=sol.numMovesStones(a,b,c);

        for(int ans:answer){
            System.out.println(ans);
        }

    }
}
