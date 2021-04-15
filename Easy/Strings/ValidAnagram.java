/* COMPLETED
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

An anagram is a word, phrase, or name formed by rearranging the letters of another, such as spar, formed from rasp.
*/

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        boolean isAnagram;
        
        // convert strings to char arrays     
        char [] s_array = s.toCharArray();
        char [] t_array = t.toCharArray();
        
        // sort char arrays alphabetically 
        Arrays.sort(s_array);
        Arrays.sort(t_array);
        
        //iterate through both arrays and compare [i] values. 
        //if values are the same = pass
        //if values arent the same = fail
        for(int i=0; i<s_array.length && i<t_array.length; i++){
            if(s_array[i] != t_array[i]){
                isAnagram = false; 
            }
            else{
                isAnagram = true;
            }
         }
        return isAnagram;
    } 
}
