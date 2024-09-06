package Leetcode_Problems.LeetCode_155;

import java.util.Stack;

public class MinStack {
    // creating stack;
    Stack<Integer> st;

    public MinStack() {
        st = new Stack<>();
    }
    // assigning max value to min
    int Min = Integer.MAX_VALUE;

    // pushing value and storing min val twices
    public void push(int x) {
        if (x <= Min) {
            st.push(Min);
            Min = x;
        }
        st.push(x);
    }


    // pop the lastest inserted value

    public void pop() {
        if (st.isEmpty()) {
            return;
        }
    // removing min value is pushed twices
        if (st.pop() == Min) {
            Min = st.pop();
        }
    }

    // peek the from stack

    public int top() {

        if(st.isEmpty()){
            return -1;
        }else{

            return st.peek();

        }


    }

    //return the min val
    public int getMin() {
        if (st.isEmpty()) {
            return -1;
        } else {
            return Min;
        }
    }
}
