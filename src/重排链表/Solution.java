package 重排链表;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
        List<ListNode> list=new ArrayList<>();
        ListNode node=head;
        while(node!=null){
            list.add(node);
            node=node.next;
        }
        int left=0,right=list.size()-1;
        while(left<right){
            list.get(left).next=list.get(right);
            left++;
            if(left==right){
                break;
            }
            list.get(right).next=list.get(left);
            right--;
        }
        list.get(left).next=null;
        /*while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }*/
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        ListNode node5=new ListNode(5,null);
        ListNode node4=new ListNode(4,node5);
        ListNode node3=new ListNode(3,node4);
        ListNode node2=new ListNode(2,node3);
        ListNode node1=new ListNode(1,node2);
        ListNode head=node1;
        /*while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }*/
        sol.reorderList(head);
    }
}
