/* COMPLETED
Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.
*/

public class ReverseString {
    //put one pointer [left] at s[0]
    //put another pointer [right] at s[n -1]
    // swap left and right pointer until left pointer is equal to right pointer
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;
        while(left < right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}
