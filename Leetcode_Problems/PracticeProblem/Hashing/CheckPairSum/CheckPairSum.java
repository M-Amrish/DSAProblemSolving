package Leetcode_Problems.PracticeProblem.Hashing.CheckPairSum;

import java.util.HashSet;

public class CheckPairSum {
    public static void main(String[] args) {
        int B[] = new int[]{3, 5, 1, 2, 1, 2
        };

        int A = 8;

        int ans = solve(A,B);

        if( ans == 1){
            System.out.println("Pair is present....");
        }else{
            System.out.println("Pair is not present !!!");
        }
    }

    public static int solve(int A, int[] B) {

        int k =0, n = B.length;

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<n; i++){

            k  = A  - B[i];

            if(hs.contains(k)){
                return 1;
            }else{
                hs.add(B[i]);
            }
        }

        return 0;
    }
}
