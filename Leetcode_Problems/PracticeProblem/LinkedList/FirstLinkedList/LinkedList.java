package Leetcode_Problems.PracticeProblem.LinkedList.FirstLinkedList;

// creating linkedlist node and printing node...
// create class for LinkedList
class ListNode{

    public int val;
    public ListNode next;

    // initialization value
    ListNode(int x){
        this.val = x;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        // create Head node
        ListNode Head =  new ListNode(1);

        Head.next = new ListNode(2);

        ListNode temp = Head;

        // printing node
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
