package Leetcode_Problems.LeetCode_234;

class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
    }
}


public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode prev = null;
        ListNode curr = slow.next;

        while(curr != null){

            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;

        }

        ListNode P1 = head;
        ListNode P2 = prev;

        while(P2 != null){
            if(P1.val != P2.val){
                return false;
            }
            P1 = P1.next;
            P2 = P2.next;
        }

        return true;

    }
}
