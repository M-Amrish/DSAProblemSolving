package Leetcode_Problems.PracticeProblem.LinkedList.PalindromeLinkedList;
class Node{
    public int val;
    Node next;

    Node(int x){
        this.val =x;
    }
}

public class PalindromeLL {
    public static void main(String[] args) {

       Node head = new Node(1);

//        Node n1 = new Node(2);
//        Node n2 = new Node(3);
//        Node n3 = new Node(2);
//        Node n4 = new Node(1);

        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(1);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        boolean ans = palindrome(head);
        System.out.println(ans);

    }


    public static boolean palindrome(Node head){

        Node temp = head;
        int count = 0;

        while(temp != null){
           count++;
           temp = temp.next;
        }

        temp = head;
        for(int i=0; i< count/2; i++){
            temp = temp.next;
        }

        Node prev = null;
        Node curr = temp;
        while(curr != null){

            Node fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        Node i = head;
        Node j = prev;

        while (j != null){

            if( i.val != j.val){
                return  false;
            }
            i= i.next;
            j = j.next;
        }

        return true;
    }
}
