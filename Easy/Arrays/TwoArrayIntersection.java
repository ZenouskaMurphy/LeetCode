/* COMPLETED
Given two arrays, write a function to compute their intersection.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
*/

public class TwoArrayIntersection {

    public int[] intersect(int[] nums1, int[] nums2) {
        //create arraylist to add intersections between nums1 and nums2 array
        List<Integer> intersection = new ArrayList<>();
        
        // sort arrays to make comparisons
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0;
        int j = 0;
        
        while(i< nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if (nums1[i] > nums2[j]){
                j++;
            }
            else{
                intersection.add(nums1[i]);
                i++;
                j++;
            }    
        }
        // create result array as we need to return array
        int [] result = new int[intersection.size()];
    
        // iterate through arraylist to add intersections to result array
        for(int k=0; k<intersection.size(); k++){
            result[k] = intersection.get(k);
        }   
        return result;
    }
}
