/* COMPLETED
Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

A palindrome is a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or nurses run.
*/

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        boolean isPalindrome;
        //create pointer for start of string
        int start = 0;
        //create pointer for end of string
        int end = s.length() - 1;
        
        while (start < end){
            //if start and end chars are not the same = false
            if(s.charAt(start) != s.charAt(end)){
                isPalindrome = false;
            }
            //increment position of pointer through array
            start++;
            //decrement position of pointer through array
            end--;
        }
        isPalindrome = true;
        return isPalindrome;
    } 
}
