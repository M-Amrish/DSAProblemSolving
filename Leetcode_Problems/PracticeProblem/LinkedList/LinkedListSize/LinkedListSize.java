package Leetcode_Problems.PracticeProblem.LinkedList.LinkedListSize;

class ListNode{
    public int value;
    public ListNode next;

    ListNode(int x){
        this.value = x;
    }

}

public class LinkedListSize {
    public static void main(String[] args) {

        int cnt = 0;

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

        // storing head in temp variable
        temp = Head;


        // iterating
        while (temp != null){
                cnt++;
            //System.out.println(temp.value);
                temp = temp.next;
        }

        // printing count of LinkedList
        System.out.println(cnt);

    }
}
