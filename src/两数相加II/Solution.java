package 两数相加II;

import java.util.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1=new ArrayDeque<>();
        Deque<Integer> stack2=new ArrayDeque<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1=l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        ListNode ans=null;
        while(!stack1.isEmpty()||!stack2.isEmpty()||carry!=0){
            int a=stack1.isEmpty()?0:stack1.pop();
            int b=stack2.isEmpty()?0:stack2.pop();
            int cur=a+b+carry;
            carry=cur/10;
            cur%=10;
            ListNode curnode=new ListNode(cur);
            curnode.next=ans;
            ans=curnode;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 2, 4, 3}, arr2 = {5, 6, 4};
        ListNode l1=new ListNode(7);
        ListNode l2=new ListNode(5);

        for(int i=1;i<arr1.length;i++){
            l1.next=new ListNode(arr1[i]);
            l1=l1.next;
        }
        for(int i=1;i<arr2.length;i++){
            l2.next=new ListNode(arr2[i]);
            l2=l2.next;
        }


        Solution sol=new Solution();
        sol.addTwoNumbers(l1,l2);

    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
