package Leetcode_Problems.PracticeProblem.Hashing.CountDistinctElements;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {

        int A[] = new int[]{1,2,1,3,4,5,6,6,8,8};
        int size = solve(A);

        System.out.println("Size of Distinct Element is .." + size);

    }

    public static  int solve(int A[]){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<A.length; i++){
            hs.add(A[i]);
        }

        return hs.size();

    }
}
