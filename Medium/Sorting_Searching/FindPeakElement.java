/* COMPLETED
A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.


Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
*/


public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        /* Binary Search Algorithm */
        int start = 0;
        int end = nums.length -1;
        
        while(start < end){
            int middle = start + (end - start) / 2;
            
            if(nums[middle] > nums[middle + 1]){
                end = middle;
            }
            else{
                start = middle + 1;
            }
        }
        return start;
    }  
}
