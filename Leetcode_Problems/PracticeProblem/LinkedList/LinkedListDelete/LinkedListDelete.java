package Leetcode_Problems.PracticeProblem.LinkedList.LinkedListDelete;

class ListNode{

    public int val;
    public ListNode next;

    ListNode(int x){
        val = x;
    }
}

public class LinkedListDelete {

    public static void main(String[] args) {
        int position = 3;
        // adding element
       ListNode Head = new ListNode(1);

        // storing in temp variable
       ListNode temp = Head;

        // adding element
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(8);
        temp = temp.next;
        temp.next = new ListNode(4);
        temp = temp.next;
        temp.next = new ListNode(9);
        temp = temp.next;
        temp.next = new ListNode(7);


        temp = Head;

        System.out.println("Before deleting element...");
        while(temp != null){
            System.out.print(temp.val);
            temp = temp.next;
        }

        delete_node(3,Head);

    }

    public static void delete_node(int position, ListNode Head) {
        ListNode temp = Head;
        if(position == 1){
            Head = Head.next;
        }else{
            int count = 1;


            while(count < position-1){
                count++;
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }


        temp = Head;

        System.out.println("After deleting element...");
        while(temp != null){
            System.out.print(temp.val);
            temp = temp.next;
        }
    }
}
