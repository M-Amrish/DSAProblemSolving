package Leetcode_Problems.LeetCode_138;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class RandomPointer {
    public Node copyRandomList(Node head) {

        Node curr = head;

        while(curr != null){
            Node nn = new Node(curr.val);

            nn.next = curr.next;
            curr.next = nn;

            curr = curr.next.next;
        }

        curr =  head;
        Node temp = head.next;

        while(curr != null){
            if(curr.random != null){
                temp.random = curr.random.next;
            }

            curr = curr.next.next;

            if(temp.next != null){

                temp = temp.next.next;
            }

        }

        temp = head.next;
        curr = head;
        Node ans = temp;

        while(curr != null){

            curr.next = curr.next.next;

            if(temp.next != null){

                temp.next = temp.next.next;
            }

            if(curr != null){
                curr = curr.next;
            }

            temp = temp.next;

        }

        return ans;
    }
}
