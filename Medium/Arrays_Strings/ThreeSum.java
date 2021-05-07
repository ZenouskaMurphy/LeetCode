/* COMPLETED BAR DUPLICATE LISTS EDGE CASE
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:
Input: nums = []
Output: []
*/

public class ThreeSum {
    /*  The array is sorted.
        We have i, a left pointer [i+1] and a right pointer [nums.length-1].
        We will compare the val of these three pointers in array and add up to see if they equal 0.
        If they do, we add the three elements to <List<List<Integer>>
        If sum is too big, we move right pointer to the left to make sum smaller
        If sum is too small, we move left pointer to the right to make sum larger
    */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
           
        for(int i=0; i<nums.length-2; i++){
            int left = i+1; 
            int right = nums.length-1;
            int sum = nums[i] + nums[left] + nums[right]; 
            while(left < right){
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); 
                    left++;
                    right--;
                }
                else if(sum > 0){
                    right--;
                }
                else{
                    left++;
                }   
            }
        }
        return result;
    }
}
