package 节点与其祖先间的最大差值;

public class TreeNode {
    int val;
   TreeNode left;
   TreeNode right;
   TreeNode() {}
   TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
      this.left = left;
     this.right = right;
  }
}

