package Leetcode_Problems.PracticeProblem.Stack;

import java.util.Stack;

public class RedundantBraces {
    public int braces(String A) {

        Stack<Character> st = new Stack<>();

        for(int i=0; i<A.length(); i++){

            if(A.charAt(i) == '(' || A.charAt(i) == '+' || A.charAt(i) == '-'
                    || A.charAt(i) == '*' || A.charAt(i) == '/'){

                st.add(A.charAt(i));
            }
            if(A.charAt(i) == ')'){

                if(st.peek() == '('){

                    return 1;
                }else{

                    while(st.peek() != '('){
                        st.pop();
                    }

                }
                st.pop();
            }
        }

        return 0;
    }
}
