/* NOT COMPLETED. NEED TO ACCOUNT FOR 9 GOING TO 1,0 , NOT 10
Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

Example 3:
Input: digits = [0]
Output: [1]
*/

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int [] new_array = new int [digits.length]; 
        
        int last_digit = digits[digits.length-1]; 
        int new_last_digit = last_digit + 1; 
        
        for(int i=0; i<digits.length-1; i++){
            new_array[i] = digits[i];
        }
        for(int i=digits.length-1; i<digits.length; i++){
            new_array[i] = new_last_digit;
        }
        return new_array;
    }
}
