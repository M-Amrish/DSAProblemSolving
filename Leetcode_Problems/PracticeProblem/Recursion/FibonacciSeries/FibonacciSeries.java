package Leetcode_Problems.PracticeProblem.Recursion.FibonacciSeries;

// 0 1 1 2 3 8 11
// 0 1 2 3 4 5 6
public class FibonacciSeries {
    public static void main(String[] args) {

        int ans =  solve(6);

        System.out.println(ans);
    }

    public static  int solve(int N){
        if(N <=1){
            return 1;
        }

        return solve(N-1)+solve(N-2);
    }
}
