package 节点与其祖先间的最大差值;

public class Solution {


    public int maxAncestorDiff(TreeNode root) {
        return dfs(root,root.val,root.val);
    }

    public int dfs(TreeNode node,int mi,int ma){
        if(node==null){
            return 0;
        }


        int diff=Math.max(Math.abs(mi- node.val),Math.abs(ma-node.val));

        mi=Math.min(mi,node.val);
        ma=Math.max(ma,node.val);

        diff=Math.max(diff,dfs(node.left,mi,ma));
        diff=Math.max(diff,dfs(node.right,mi,ma));

        return diff;


    }


}
