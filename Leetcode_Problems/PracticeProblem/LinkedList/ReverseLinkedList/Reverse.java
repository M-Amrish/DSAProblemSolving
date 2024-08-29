package Leetcode_Problems.PracticeProblem.LinkedList.ReverseLinkedList;

class Node{
    public int val;
    Node next;

    Node(int x){
        this.val = x;
    }

}
public class Reverse {
    public static void main(String[] args) {

        Node head = new Node(1);

        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;


        System.out.println("Before Changing.....");

        Node tmep = head;

        while(tmep != null){
            System.out.print(tmep.val+ " ");
            tmep = tmep.next;
        }


        Node ans = reverse(head);


        System.out.println("After Changing.....");

        tmep = ans;

        while(tmep != null){
            System.out.print(tmep.val+ " ");
            tmep = tmep.next;
        }

    }


    public static Node reverse(Node root){

        Node current = root;



        Node prev = null;

        while(current != null){
            Node fwd = current.next;
            current.next = prev;
            prev = current;
            current = fwd;
        }
        root = prev;

        return root;

    }
}
