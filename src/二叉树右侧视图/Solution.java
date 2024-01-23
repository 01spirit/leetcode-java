package 二叉树右侧视图;

import com.sun.source.tree.Tree;

import java.util.*;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size-1;i++){ // 遍历 i-1 个结点
                TreeNode node=queue.poll();
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            TreeNode node=queue.poll();
            list.add(node.val);        //  处理每一层最后一个结点
            if(node.left!=null) queue.offer(node.left);
            if(node.right!=null) queue.offer(node.right);
        }
        return list;
    }



    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] arr={1,2,3,5,4};
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        TreeNode node5=new TreeNode(5);
        TreeNode node4=new TreeNode(4);
        TreeNode nodeN0=new TreeNode();
        TreeNode nodeN1=new TreeNode();

        node1.left=node2;
        node1.right=node3;
        node2.right=node5;
        node2.left=nodeN0;
        node3.left=nodeN1;
        node3.right=node4;

        System.out.println(Arrays.toString(sol.rightSideView(node1).toArray()));

    }
}
