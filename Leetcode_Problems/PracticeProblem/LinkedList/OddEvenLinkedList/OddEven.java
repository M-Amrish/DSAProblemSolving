package Leetcode_Problems.PracticeProblem.LinkedList.OddEvenLinkedList;
class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
    }
}

class OddEven {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);

        ListNode t1 = new ListNode(2);
        ListNode t2 = new ListNode(3);
        ListNode t3 = new ListNode(4);
        ListNode t4 = new ListNode(5);

        head.next = t1;
        t1.next = t2;
        t2.next = t3;
        t4.next = t4;

        oddEvenList(head);

    }

    public static void oddEvenList(ListNode head) {

        ListNode odd = head;

        ListNode even = head.next;

        while(odd.next.next != null){
            odd.next = odd.next.next;
        }

        // while(even.next.next != null){
        //     even.next = even.next.next;
        // }

        // odd.next = even;


        ListNode temp = odd;

        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
}
