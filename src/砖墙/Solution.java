package 砖墙;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> cnt=new HashMap<>();
        for(List<Integer> width:wall){
            int wideLen=width.size();
            int sum=0;
            for(int i=0;i<wideLen-1;i++){
                sum+=width.get(i);
                cnt.put(sum, cnt.getOrDefault(sum,0)+1);
            }
        }
        int maxValue=0;
        for(Map.Entry<Integer,Integer> entry:cnt.entrySet()){
            maxValue=Math.max(maxValue,entry.getValue());
        }
        return wall.size()-maxValue;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        List<List<Integer>> wall=new ArrayList<>();
        int[][] iniWall={{1, 2, 2, 1},{3, 1, 2},{1, 3, 2},{2, 4},{3, 1, 2},{1, 3, 1, 1}};

        for(int i=0;i< iniWall.length;i++){
            List<Integer> list=new ArrayList<>();
            for(int num:iniWall[i]){
                list.add(num);
            }
            wall.add(list);
        }
        System.out.println(sol.leastBricks(wall));
    }
}
