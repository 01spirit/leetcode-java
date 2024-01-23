package 二叉树每层的最大值;

import java.util.*;

public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> maxOflevel=new ArrayList<>();
        Queue<TreeNode> level=new LinkedList<>();
        if(root==null){
            return maxOflevel;
        }
        level.offer(root);
        while(!level.isEmpty()){
            int max=Integer.MIN_VALUE;
            int len=level.size();
            for(int i=0;i<len;i++){
                TreeNode cur=level.poll();
                max=Math.max(max,cur.val);
                if(cur.left!=null){
                    level.offer(cur.left);
                }
                if(cur.right!=null){
                    level.offer(cur.right);
                }
            }
            maxOflevel.add(max);
        }
        return maxOflevel;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
//      root = [3,9,20,null,null,15,7]
        TreeNode treeNode6=new TreeNode(5);
        TreeNode treeNode5=new TreeNode(3);
        TreeNode treeNode4=new TreeNode();
        TreeNode treeNode3=new TreeNode();
        TreeNode treeNode2=new TreeNode(3,treeNode5,treeNode6);
        TreeNode treeNode1=new TreeNode(2);
        TreeNode root=new TreeNode(1,treeNode1,treeNode2);


        System.out.println(Arrays.toString(sol.largestValues(root).toArray()));
    }
}
