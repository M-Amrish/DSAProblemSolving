package Leetcode_Problems.PracticeProblem.LinkedList.LinkedListInsert;



class  ListNode{
    public int value;
    public ListNode next;

    ListNode(int x){
        this.value = x;
    }
}

public class LinkedListInsert {

    public static void main(String[] args) {
        int position = 3;
        int values = 3;

        // adding element
        ListNode Head = new ListNode(1);

        ListNode temp = Head;

        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(4);
        temp = temp.next;
        temp.next = new ListNode(5);
        temp = temp.next;
        temp.next = new ListNode(6);

        temp = Head;

        // printing element before adding
        System.out.println("Before inserting value...");
        while (temp != null){

            System.out.print(temp.value);
            temp = temp.next;
        }
        System.out.println("");

        insert(Head, position, values);


    }

    public static void insert(ListNode Head, int position, int values){

        ListNode newValue = new ListNode(values);

        ListNode temp = Head;

        if(position == 1){
            newValue.next = Head;
            Head = Head.next;
        }else{
            int count = 1;
            while(count < position-1){
                temp = temp.next;
                count++;
            }

             newValue.next = temp.next;
             temp.next = newValue;
        }

        temp = Head;

        // printing element after adding
        System.out.println("After inserting value...");
        while (temp != null){

            System.out.print(temp.value);
            temp = temp.next;
        }
        System.out.println("");

    }
}
