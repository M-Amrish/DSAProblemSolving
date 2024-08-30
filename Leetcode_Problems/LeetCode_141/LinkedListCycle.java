package Leetcode_Problems.LeetCode_141;

class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
    }
}


public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {

        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;

            if(s==f){
                return true;
            }

        }

        return false;

    }
}
