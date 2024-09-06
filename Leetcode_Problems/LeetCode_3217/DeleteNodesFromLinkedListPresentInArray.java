package Leetcode_Problems.LeetCode_3217;

import java.util.HashSet;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class DeleteNodesFromLinkedListPresentInArray {
    public ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer> set = new HashSet<>();
        // adding in hashset
        for(Integer i : nums){
            set.add(i);
        }

        ListNode dummy = new ListNode(-1);

        dummy.next = head;
        ListNode curr = dummy;
        // deleting from LL
        while(curr.next != null){
            if(set.contains(curr.next.val)){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }

        return dummy.next;

    }
}
