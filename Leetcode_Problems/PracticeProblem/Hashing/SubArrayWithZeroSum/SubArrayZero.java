package Leetcode_Problems.PracticeProblem.Hashing.SubArrayWithZeroSum;

import java.util.HashSet;

public class SubArrayZero {
    public static void main(String[] args) {
        //int A[] = new int[] {4, -1, 1};

        int A[] = new int[] {1, 2, 3, 4, 5};

        int ans = solve(A);

        if(ans == 1){
            System.out.println("Yes --> SubArray Contains Zero...");
        }else{
            System.out.println("No --> SubArray Contains Zero...");
        }
    }


    public static  int solve(int A[]){

        HashSet<Integer> hs = new HashSet<>();
        hs.add(0);

        int sum =0;

        for(int i=0; i<A.length; i++){
            sum += A[i];

            if(sum == 0){
                return 1;
            } else if
            (hs.contains(sum)){
                return 1;
            }else{
                hs.add(sum);
            }

        }
        return 0;

    }

}

