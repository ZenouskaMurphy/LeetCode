/* COMPLETED
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
*/

public class SingleNumber{
    public int singleNumber(int[] nums) {
        //create arraylist to enable contains, add and remove functionality
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            // if arraylist does not contain number .. add this number to arraylist
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
            // if arraylist contains number.. remove this integer from the arraylist
            else{
                list.remove(new Integer(nums[i]));
            }
        }
        //return first element of list
        return list.get(0);
    }  
}
