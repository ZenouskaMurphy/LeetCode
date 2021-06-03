/* COMPLETED
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int [] count = new int[256];                          //count instance of each element in nums
        HashMap<Integer, Integer> map = new HashMap<>();     // hashmap with key = element, value = count 
                                           
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
            map.put(nums[i], count[nums[i]]);   
        }        
        
        Map.Entry<Integer, Integer> majorityEntry = null;          
        for(Map.Entry <Integer, Integer> entry: map.entrySet()){   // iterate through hashmap 
             if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                 majorityEntry = entry;
             }
        }
        return majorityEntry.getKey();
    }
}
