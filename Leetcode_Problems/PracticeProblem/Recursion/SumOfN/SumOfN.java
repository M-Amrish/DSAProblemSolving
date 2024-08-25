package Leetcode_Problems.PracticeProblem.Recursion.SumOfN;

public class SumOfN {
    public static void main(String[] args) {

        int ans = solve(10);

        System.out.println(ans);
    }

    public static  int  solve(int A){

        if(A == 1){
            return 1;
        }

        return solve(A-1)+A;
    }


}
