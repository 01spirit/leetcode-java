package 按身高排序;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> height=new HashMap<>();
        for(int i=0;i< names.length;i++){
            height.put(heights[i],names[i]);
        }

        //从大到小排序
        int len=0;
        String[] sortedName=new String[names.length];
        Integer[] indices = new Integer[names.length];
        for (int i = 0; i < names.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> heights[b] - heights[a]);
        for(int i=0;i< names.length;i++){
            sortedName[i]=names[indices[i]];
            System.out.println(indices[i]);
        }

        return sortedName;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        String[] names= {"Mary","John","Emma"};
        int[] heights={180,165,170};

        for(int i=0;i< names.length;i++){
            System.out.println(sol.sortPeople(names,heights)[i]);
        }

    }
}
