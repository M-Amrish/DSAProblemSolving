package Leetcode_Problems.PracticeProblem.LinkedList.ReorderList;

class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
public class ReorderList {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);

        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;


        ListNode ans = reorderList(head);

        ListNode temp = ans;

        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }


    public static ListNode reorderList(ListNode A) {

        // Finding middle of LL

        ListNode slow = A;
        ListNode fast = A;

        while(fast.next != null && fast.next.next != null ){

            slow = slow.next;
            fast = fast.next.next;
        }

      //  return slow;
        // reverse the 2nd half LL
        ListNode curr = slow;

        ListNode prev = null;
        ListNode fwd = null;




        while (curr != null){

            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

     //   return  A;
        // Connecting two LL
        ListNode l1 = A;
        ListNode l2 = prev;

    //    return  A;
        while(l1 != null && l2 != null){

            ListNode l1Nxt = l1.next;
            ListNode l2Nxt = l2.next;

            l1.next = l2;
            l2.next = l1Nxt;

            l1 = l1Nxt;
            l2 = l2Nxt;

        }

            return A;
    }
}
