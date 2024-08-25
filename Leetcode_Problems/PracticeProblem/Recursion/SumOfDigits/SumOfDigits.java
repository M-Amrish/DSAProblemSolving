package Leetcode_Problems.PracticeProblem.Recursion.SumOfDigits;

public class SumOfDigits {

    public static void main(String[] args) {

        int ans = solve(12345);

        System.out.println(ans);
    }

    public static  int solve(int A) {
        if(A == 0){
            return 0;
        }

        return  solve(A/10) + (A % 10);
    }
}
