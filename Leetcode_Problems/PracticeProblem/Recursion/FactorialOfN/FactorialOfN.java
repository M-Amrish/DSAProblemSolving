package Leetcode_Problems.PracticeProblem.Recursion.FactorialOfN;

public class FactorialOfN {

    public static void main(String[] args) {

        int ans  = solve(5);
        System.out.println(ans);
    }


    public static int  solve(int N){

        if(N == 1){
            return 1;
        }

        return solve(N-1) * N;
    }
}


