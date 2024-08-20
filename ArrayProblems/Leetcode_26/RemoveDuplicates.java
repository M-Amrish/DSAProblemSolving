package ArrayProblems.Leetcode_26;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        int i=0, j=1;

        while(j<n){

            if(nums[i] !=nums[j]){
                nums[i+1] = nums[j];

                i++;
            }
            j++;
        }


        return i+1;


    }
}
