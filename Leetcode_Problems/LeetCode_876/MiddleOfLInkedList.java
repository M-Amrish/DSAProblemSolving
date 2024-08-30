package Leetcode_Problems.LeetCode_876;


class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
    }
}
public class MiddleOfLInkedList {
    public ListNode middleNode(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
}
