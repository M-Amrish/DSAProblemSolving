package Leetcode_Problems.LeetCode_239;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> deq = new ArrayDeque<>();

        int a[] = new int[nums.length -k + 1];
        int in = 0;

        for(int i=0; i<k; i++){

            while(deq.size() != 0 && nums[i] > deq.getLast() ){

                deq.removeLast();
            }

            deq.addLast(nums[i]);
        }

        a[in++] = deq.getFirst();

        int s = 1, e = k, n = nums.length;

        while(e < n){
            if(nums[s-1] == deq.getFirst())
            {

                deq.removeFirst();
            }

            while(deq.size() != 0 && nums[e] > deq.getLast()){
                deq.removeLast();
            }

            deq.addLast(nums[e]);
            a[in++] = deq.getFirst();
            s++;
            e++;

        }

        return a;


    }
}
