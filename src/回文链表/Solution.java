package 回文链表;

import java.util.Stack;

public class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode node=head;
        Stack<ListNode> stack=new Stack<>();
        while(node!=null){
            stack.add(node);
            node=node.next;
        }

        while(head!=null){
            if(head.val!=stack.pop().val){
                return false;
            }
            else{
                head=head.next;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(4);
        ListNode n4=new ListNode(3);
        ListNode n5=new ListNode(1);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
/*
        while(n1!=null){
            System.out.println(n1.val);
            n1=n1.next;
        }*/

        System.out.println(sol.isPalindrome(n1));

    }
}
