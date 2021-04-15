/*COMPLETED
Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
*/

public class RotateArray{
    public void rotate(int[] nums, int k) {
        //create new temp array
        //reorder each element in the temp array based on k 
        int [] temp = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            temp[(i + k) % nums.length] = nums[i] ;
        }
        //copy the new array to the original one  
        for(int i=0; i<nums.length; i++){
            nums[i] = temp[i];
        }
    }   
}
