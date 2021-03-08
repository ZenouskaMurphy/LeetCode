/*COMPLETED
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
*/


public class RemoveDuplicates {
    //we create int index and and start it at 1 as pos 0 is always unique
    public int removeDuplicates(int[] nums) {  
        int index = 1;
        for(int i=0 ; i<nums.length-1; i++){
             //we compare the values of i and i + 1 
            if(nums[i] != nums[i + 1]){
                //if they are not the same we would like current val of index to be the val of num on right of i 
                nums[index] = nums[i + 1];
                // iterate up through array
                index++;
            }
        }
        return index;
    }
}