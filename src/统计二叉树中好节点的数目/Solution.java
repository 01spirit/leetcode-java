package 统计二叉树中好节点的数目;

import com.sun.source.tree.Tree;

public class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root,Integer.MIN_VALUE);
    }

    public int dfs(TreeNode node,int pathMax){
        if(node==null){
            return 0;
        }
        int res=0;
        if(node.val>=pathMax){
            res++;
            pathMax=node.val;
        }
        res+=dfs(node.left,pathMax);
        res+=dfs(node.right,pathMax);

        return res;
    }

    public static void main(String[] args) {

    }
}
