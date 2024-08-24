package Leetcode_Problems.PracticeProblem.Sliding_Window;

public class PrintBoundaryClockwise {

    public static void main(String[] args) {

        int a[][] = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

       printBoundaryClockwise(a,a.length,0,0);

    }

    public static void  printBoundaryClockwise(int [][]A, int N, int i, int j) {

        for(int k =1; k<N; k++){
            System.out.print(A[i][j]+" ");
            j++;
        }

        for(int k =1; k<N; k++){
            System.out.print(A[i][j] +" ");
            i++;
        }

        for(int k=1; k<N; k++){
            System.out.print(A[i][j] +" ");
            j--;
        }

        for(int k=1; k<N; k++){
            System.out.print(A[i][j] +" ");
            i--;
        }
    }


}
