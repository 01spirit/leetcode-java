package 不邻接植花;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }

        for (int[] path : paths) {

            adj[path[0] - 1].add(path[1] - 1);
            adj[path[1] - 1].add(path[0] - 1);
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            boolean[] colored = new boolean[5];
            for (int vertex : adj[i]) {
                colored[ans[vertex]] = true;
            }
            for (int j = 1; j <= 4; j++) {
                if (!colored[j]) {
                    ans[i] = j;
                    break;
                }
            }
        }
//        for(int i=0;i<n;i++){
//            System.out.println(adj[i]);
//        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] paths={{1,2},{2,3},{3,1}};
        int n= 3;
        Solution sol=new Solution();

        sol.gardenNoAdj(n,paths);
    }
}

