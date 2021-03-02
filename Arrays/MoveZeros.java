/* COMPLETED
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int size_array = nums.length;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            //get instances of where array element is not 0. Count these instances
            //add these elements to the beginning of the array
            //stop counting when the element array is 0
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        //from the point where the last element is not 0, we add zeros until we fil the size of array 
        while(count < size_array){
            nums[count++] = 0;
        }
    }
}