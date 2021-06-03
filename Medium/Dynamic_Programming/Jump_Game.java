/* NOT COMPLETED
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
*/


public class Jump_Game {
    public boolean canJump(int[] nums) {
        int start_index = 0; 
        int element_at_start_index = nums[start_index];
        int last_index = nums.length-1;
 
        int next_index = start_index + element_at_start_index;  
        int element_at_next_index = nums[next_index]; 
            
        if(next_index < last_index && element_at_next_index != 0){
            start_index = next_index;
        }
        else{
            return false;
        }
        return true;
    } 
}
