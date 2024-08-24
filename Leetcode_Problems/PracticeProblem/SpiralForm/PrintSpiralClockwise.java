package Leetcode_Problems.PracticeProblem.SpiralForm;

public class PrintSpiralClockwise {

    public static void main(String[] args) {
        int a[][] = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        printSpiralClockwise(a, a.length);
    }

   public static void  printSpiralClockwise(int a[][], int N){
        int i=0, j=0;

        while(N>0){
            printBoundaryClockwise(a,N,i,j);
            i++;
            j++;
            N -= 2;
        }
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
