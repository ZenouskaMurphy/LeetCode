/* NOT COMPLETED
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
*/


public class RemoveDuplicates {
    //we are using two pointers i and j
    //i will start at nums[0] and j will start at nums[1]
    public int removeDuplicates(int[] nums) {  
        int i = 0;
        for(int j=1 ; j<nums.length; j++){
             //we compare the values of i and j 
             // if j != i, this means no duplicates
            if(nums[j] != nums[i]){
                //increment position of i by 1
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}