package 两棵二叉搜索树中的所有元素;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> list2=new ArrayList<Integer>();
        List<Integer> list=new ArrayList<Integer>();
        Inorder(root1,list1);
        Inorder(root2,list2);

        int p1=0,p2=0;
        while(true){
            if(p1==list1.size()){
                list.addAll(list2.subList(p2,list2.size()));
                break;
            }
            if(p2==list2.size()){
                list.addAll(list1.subList(p1,list1.size()));
                break;
            }
            if(list1.get(p1)<list2.get(p2)){
                list.add(list1.get(p1));
                p1++;
            }
            else{
                list.add(list2.get(p2));
                p2++;
            }
        }

        return list;
    }

    public void Inorder(TreeNode node,List<Integer> res){
        if(node!=null){
            Inorder(node.left,res);
            res.add(node.val);
            Inorder(node.right,res);
        }
    }
}
