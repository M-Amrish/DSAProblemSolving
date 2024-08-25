package Leetcode_Problems.PracticeProblem.Recursion.IncreasingPrint;

public class IncreasingPrint {
    public static void main(String[] args) {
            solve(5, 1);
    }

    public static int solve(int N, int a){

        if ( a > N){
            return 0;
        }
        System.out.println(a);
        return solve( N,a+1);


    }
}
