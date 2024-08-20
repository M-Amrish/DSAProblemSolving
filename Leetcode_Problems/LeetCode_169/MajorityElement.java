package Leetcode_Problems.LeetCode_169;

public class MajorityElement  {
    public int majorityElement(int[] nums) {

        int count = 0;
        int element = 0;

        for(int ele : nums){

            if(count == 0){
                element = ele;
            }

            if(element == ele){
                count++;
            }else{
                count--;
            }
        }

        return element;

    }
}