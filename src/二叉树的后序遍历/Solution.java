package 二叉树的后序遍历;

import java.util.ArrayList;
import java.util.List;

//左右根 顺序
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }

        postTraverse(root,res);


        return res;
    }

    private void postTraverse(TreeNode node,List<Integer> res){
        if(node==null){
            return;
        }
        postTraverse(node.left,res);
        postTraverse(node.right,res);
        res.add(node.val);

    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        TreeNode node3=new TreeNode(3,null,null);
        TreeNode node2=new TreeNode(2,node3,null);
        TreeNode node1=new TreeNode(1,null,node2);

        TreeNode root=node1;
        System.out.println(sol.postorderTraversal(root));

    }
}
