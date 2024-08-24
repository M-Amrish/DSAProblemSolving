package Leetcode_Problems.LeetCode_2149;

public class RearrangeArray {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int arr[] = new int[n];

        int po = 0;
        int ne = 1;

        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                arr[po] = nums[i];
                po += 2;
            }else{
                arr[ne] = nums[i];
                ne += 2;
            }
        }

        return arr;
    }
}
