package Leetcode_Problems.Leetcode_724;

class FindPivotIndex {
    public int pivotIndex(int[] nums) {

        int n = nums.length;
        int total = 0;
        int left = 0;

        // finding total sum
        for(int i=0; i<n; i++){
            total += nums[i];
        }

        int right = total;

        // iterating
        for(int i=0; i<n; i++){

            right -= nums[i];

            // checking condition
            if(left == right){
                return i;
            }

            left += nums[i];

        }

        return -1;


    }
}