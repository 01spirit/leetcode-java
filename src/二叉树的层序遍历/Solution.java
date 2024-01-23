package 二叉树的层序遍历;

import com.sun.source.tree.Tree;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ret.add(level);
        }

        return ret;
    }


    public static void main(String[] args) {
        Solution sol=new Solution();
//      root = [3,9,20,null,null,15,7]
        TreeNode treeNode6=new TreeNode(7);
        TreeNode treeNode5=new TreeNode(15);
        TreeNode treeNode4=new TreeNode();
        TreeNode treeNode3=new TreeNode();
        TreeNode treeNode2=new TreeNode(20,treeNode5,treeNode6);
        TreeNode treeNode1=new TreeNode(9);
        TreeNode root=new TreeNode(3,treeNode1,treeNode2);

        List<List<Integer>> res=sol.levelOrder(root);
        System.out.println(Arrays.toString(res.toArray()));

    }
}
