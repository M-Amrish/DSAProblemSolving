package Leetcode_Problems.LeetCode_328;
class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
    }
}

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {

        ListNode odd = head;

        ListNode even = head.next;

        ListNode evenHead = head.next;

        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;

        }
        odd.next = evenHead;


        return head;

    }
}
