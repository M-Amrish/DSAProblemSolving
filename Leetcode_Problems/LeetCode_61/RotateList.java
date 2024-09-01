package Leetcode_Problems.LeetCode_61;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;

        ListNode temp = head;

        while(temp.next !=  null){
            temp = temp.next;
            length++;
        }

        temp.next = head;
        k = k % length;
        k = length - k;

        for(int i=0; i<k; i++){
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;

    }
}
