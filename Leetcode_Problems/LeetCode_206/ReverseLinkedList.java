package Leetcode_Problems.LeetCode_206;

class ListNode{
    int val;
  ListNode next;

    ListNode(int x){
        val = x;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        head = prev;
        return head;

    }
}
