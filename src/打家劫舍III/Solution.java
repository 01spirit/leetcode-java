package 打家劫舍III;


import java.util.*;

public class Solution {

    Map<TreeNode,Integer> f=new HashMap<>();
    Map<TreeNode,Integer> g=new HashMap<>();
    public int rob(TreeNode root) {
        dfs(root);

        return Math.max(f.getOrDefault(root, 0), g.getOrDefault(root, 0));
    }

    public void dfs(TreeNode node){
        if(node==null){
            return;
        }
        dfs(node.left);
        dfs(node.right);
        f.put(node, node.val + g.getOrDefault(node.left, 0) + g.getOrDefault(node.right, 0));
        g.put(node, Math.max(f.getOrDefault(node.left, 0), g.getOrDefault(node.left, 0)) + Math.max(f.getOrDefault(node.right, 0), g.getOrDefault(node.right, 0)));

    }

    public static void main(String[] args) {
        Solution sol=new Solution();

//      root = [3,4,5,1,3,null,1]
        TreeNode treeNode6=new TreeNode(1);
        TreeNode treeNode5=new TreeNode(3);
        TreeNode treeNode4=new TreeNode(4,treeNode6,treeNode5);
        TreeNode treeNode3=new TreeNode(1);
        TreeNode treeNode7=new TreeNode(5,null,treeNode3);
        TreeNode root=new TreeNode(3,treeNode4,treeNode7);

        System.out.println(sol.rob(root));
    }
}
