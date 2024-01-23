package 合并两个排序的链表;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }



        /*ListNode mergeList = new ListNode(-1);
        ListNode merge=mergeList;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                merge.next=l1;
                l1=l1.next;
            }else{
                merge.next=l2;
                l2=l2.next;
            }
            merge=merge.next;
        }
        if(l1!=null){
            merge.next=l1;
        }
        if(l2!=null){
            merge.next=l2;
        }
        return mergeList.next;*/
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1=l1.next;
        l1.next=new ListNode(4);
        ListNode l2=new ListNode(1);
        l2.next=new ListNode(3);
        l2=l2.next;
        l2.next=new ListNode(4);
    }
}
