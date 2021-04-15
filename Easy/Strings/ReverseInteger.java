/* COMPLETED
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).


Example 1:

Input: x = 123
Output: 321
*/


public class ReverseInteger {
    public int reverse(int x) {
        //starts at 0, is replaced by last number of each iteration
        int reversed = 0;
        while (x != 0){
            //get last digit of number
            int last_digit = x % 10;
            //last reversed number * 10 + new last_digit [*10 adds new place in reversed number]
            reversed = reversed * 10 + last_digit;
            // divide x by 10 so that on each loop iteration, the last number of x is removed each time
            x /= 10;  
        }
        return reversed;
    }
}
