package Leetcode_Problems.PracticeProblem.Stack;

import java.util.Stack;

public class NearestSmallerElement {

    public static void main(String[] args) {
        int A[] = new int[]{4, 5, 2, 10, 8};

        int[] ans = smallerElement(A);

        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }

    public static int[] smallerElement(int []A){

        int ans[]= new int[A.length];

        int k=0;

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<A.length; i++){

            while(st.size() != 0 && A[st.peek()] >= A[i]){
                st.pop();
            }

            if(st.size() == 0){
               ans[i] = -1;
            }else{
                ans[i] = A[st.peek()];
            }

            st.push(i);
        }

        return ans;
    }
}
