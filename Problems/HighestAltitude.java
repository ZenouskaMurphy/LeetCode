/* COMPLETED
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

Example 1:
Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

Example 2:
Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
*/

public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int reorder = 0;
        int highest = 0;
        int [] new_arr = new int[gain.length];
        
        for(int i=0; i<gain.length; i++){
            reorder = reorder + gain[i];
            new_arr[i] = reorder;
        }
        Arrays.sort(new_arr);                   // sort new array from lowest to highest altitudes
        highest = new_arr[new_arr.length-1];    // last element of array is highest altitude
        
        if(highest < 0){                        // edge case = highest element is lower altitude than start point of 0
            highest = 0;
        }
        return highest;
    }
}

