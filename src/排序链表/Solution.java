package 排序链表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public ListNode sortList(ListNode head) {
        return sortList(head,null);
    }

    public ListNode sortList(ListNode head,ListNode tail){
        if(head==null){
            return head;
        }
        if(head.next==tail){
            head.next=null;
            return head;
        }
        ListNode slow=head,fast=head;
        while(fast!=tail){
            slow=slow.next;
            fast=fast.next;
            if(fast!=tail){
                fast=fast.next;
            }
        }
        ListNode mid=slow;
        ListNode list1=sortList(head,mid);
        ListNode list2=sortList(mid,tail);
        ListNode sorted=merge(list1,list2);
        return sorted;
    }

    public ListNode merge(ListNode head1,ListNode head2){
        ListNode dummyHead=new ListNode(0);
        ListNode temp=dummyHead,temp1=head1,temp2=head2;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<=temp2.val){
                temp.next=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        if(temp1!=null){
            temp.next=temp1;
        }
        else if(temp2!=null){
            temp.next=temp2;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        Solution sol=new Solution();
        ListNode node1=new ListNode(3,null);
        ListNode node2=new ListNode(1,node1);
        ListNode node3=new ListNode(2,node2);
        ListNode node4=new ListNode(4,node3);

        ListNode head=node4;
        ListNode sor=sol.sortList(head);
        while(sor!=null){
            System.out.println(sor.val);
            sor=sor.next;
        }

    }
}
