package Leetcode_Problems.PracticeProblem.LinkedList.KReverseLinkedList;
class Node{
    public int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}


public class KReverse {
    public static void main(String[] args) {
        Node head = new Node(1);

        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        int b = 2;
        Node ans = reverse(head,b);
        Node temp = ans;

        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static  Node reverse(Node head, int b){

        int c = 0;
        Node curr = head;
        Node pre = null;
        Node next = null;

        while(curr != null && c<b){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
            c++;
        }

        if(next != null){
            head.next = reverse(next,b);
        }

        return pre;

    }
}
