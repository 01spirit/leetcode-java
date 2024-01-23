package 反转链表;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class Solution {
    public ListNode ReverseList (ListNode head) {
        // write code here
        if(head==null){
            return head;
        }
        ListNode res=head;
        Stack<ListNode> stack=new Stack<>();
        while(res!=null){
            stack.add(res);
            res=res.next;
        }

        ListNode listNode=stack.pop();
        ListNode interval=listNode;
        while(!stack.isEmpty()){
            listNode.next=stack.pop();
            listNode=listNode.next;
        }
        listNode.next=null;

        return interval;

        /*
        ListNode newHead=null;
        while(head!=null){
            ListNode tmp=head.next;
            head.next=newHead;
            newHead=head;
            head=tmp;
        }
        return newHead;
         */


    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);

        ListNode res=sol.ReverseList(head);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }

    }
}
