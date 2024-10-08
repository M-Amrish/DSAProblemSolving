package Leetcode_Problems.LeetCode_189;

public class RotateArray {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

    }


    public void reverse(int a[], int l, int r){
        while(l <= r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;

            l++;
            r--;
        }
    }
}
