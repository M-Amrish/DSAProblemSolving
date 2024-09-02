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

        if(count == 1){  // if len if 1 then return null bcz the single node will be deleted
            return null;
        }
        if(count == n){ // if len if n then we have to delete the head, so move head to next posi and return
            head= head.next;
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
