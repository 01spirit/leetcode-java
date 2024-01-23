package 二叉树的层序遍历II;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelOrder=new ArrayList<>();
        if (root == null) {
            return levelOrder;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int size= queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node=queue.poll();
                level.add(node.val);
                TreeNode left=node.left;
                TreeNode right=node.right;
                if(left!=null){
                    queue.offer(left);
                }
                if (right != null) {
                    queue.add(right);
                }
            }
            levelOrder.add(0,level);
        }
        return levelOrder;
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

        List<List<Integer>> res=sol.levelOrderBottom(root);
        System.out.println(Arrays.toString(res.toArray()));

    }
}
