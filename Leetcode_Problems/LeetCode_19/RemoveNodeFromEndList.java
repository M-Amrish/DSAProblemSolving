package Leetcode_Problems.LeetCode_19;



class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class RemoveNodeFromEndList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;

        ListNode temp = head;

        // counting element
        while(temp != null){
            temp =  temp.next;
            count++;
        }

        if(count ==1 && n ==1){
            return null;
        }else if(count == 2 ){
            head.next = null;
            return head;
        }

        temp = head;


        int i=1;

        while(temp != null && i < count-n){

            temp = temp.next;
            i++;
        }

        temp.next= temp.next.next;
        return head;
    }
}
