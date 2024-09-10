package Leetcode_Problems.LeetCode_232;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public ImplementQueueUsingStacks() {

        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {

        st1.push(x);
    }

    public int pop() {

        if(st2.size() == 0){
            while(st1.size() != 0){
                st2.push(st1.pop());
            }
        }

        return st2.pop();
    }

    public int peek() {
        if(st2.size() == 0){
            while(st1.size() != 0){
                st2.push(st1.pop());
            }
        }

        return st2.peek();
    }

    public boolean empty() {

        if(st1.size() == 0 && st2.size() == 0){
            return true;
        }

        return false;
    }
}
