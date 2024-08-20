package ArrayProblems.LeetCode_1299;

public class ReplaceElements {
    public int[] replaceElements(int[] arr) {

        int n = arr.length;

        if(n == 1){
            return new int[]{-1};
        }

        int newArray[] = new int[n];
        newArray[n-1] = -1;

        for(int i=n-2; i>=0;i-- ){

            if(arr[i+1] > newArray[i+1] ){
                newArray[i] = arr[i+1];
            }else{
                newArray[i] = newArray[i+1];
            }

        }
        return newArray;

    }
}
