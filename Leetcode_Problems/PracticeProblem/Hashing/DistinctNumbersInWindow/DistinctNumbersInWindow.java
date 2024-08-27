package Leetcode_Problems.PracticeProblem.Hashing.DistinctNumbersInWindow;

import java.util.HashMap;

public class DistinctNumbersInWindow {
    public static void main(String[] args) {
        int A[] = new int[]{2,4,3,8,3,9,4,9,4,10};
        int B = 4;
        int arr[] = dNums(A,B);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] dNums(int[] A, int B) {

        int n = A.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        int arr[] = new int[n-B+1];

        for(int i=0; i<B; i++){

            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1 );
            }else{
                map.put(A[i], 1);
            }
        }

        arr[0] = map.size();

        int s=1, e = B, k=1;

        while( e < n){

            if(map.containsKey(A[s-1])){
                map.put(A[s-1], map.get(A[s-1])-1);
            }
            if(map.get(A[s-1]) == 0){
                map.remove(A[s-1]);
            }

            if(map.containsKey(A[e])){
                map.put(A[e], map.get(A[e])+1 );
            }else{
                map.put(A[e], 1);
            }

            arr[k++] = map.size();
            s++;
            e++;

        }

        return arr;
    }
}
