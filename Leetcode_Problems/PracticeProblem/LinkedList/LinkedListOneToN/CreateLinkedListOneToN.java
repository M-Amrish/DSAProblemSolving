package Leetcode_Problems.PracticeProblem.LinkedList.LinkedListOneToN;

class ListNode{
    public int val;
    public ListNode next;

    ListNode(int x){
        this.val = x;
    }
}

public class CreateLinkedListOneToN {
    public static void main(String[] args) {

        int N = 10;

        ListNode Head = new ListNode(1);
        ListNode temp = Head;

        for(int i=2; i<= N; i++){
            temp.next = new ListNode(i);
            temp = temp.next;
        }

        temp = Head;

        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }


    }

}
