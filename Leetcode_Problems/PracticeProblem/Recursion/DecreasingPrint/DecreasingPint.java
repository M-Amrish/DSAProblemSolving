package Leetcode_Problems.PracticeProblem.Recursion.DecreasingPrint;

public class DecreasingPint {
        public static void main(String[] args) {
            solve(5);
        }

        public static int solve(int N){

            if (  N == 0){
                return 0;
            }
            System.out.println(N);
            return solve( N-1);

        }

}
