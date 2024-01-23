package 合并二叉树;

public class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode r1=root1,r2=root2;

        if (r1 == null) {
            return r2;
        }
        if (r2 == null) {
            return r1;
        }

        TreeNode res=new TreeNode(r2.val+r1.val);
        res.left=mergeTrees(r1.left,r2.left);
        res.right=mergeTrees(r1.right,r2.right);

        return res;
    }
}
