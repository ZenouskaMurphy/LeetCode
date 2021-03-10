/*COMPLETED
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".


Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/


public class LongestCommonPrefix {
    /*Vertical Scanning Approach*/
    public String longestCommonPrefix(String[] strs) {
        // if there is no common prefix, return an empty string
        if (strs == null || strs.length == 0){
            return "";
        }
        // string at index[0] is our starting point 
        for (int i = 0; i < strs[0].length() ; i++){
            //iterate through each char of string at index[0]
            char c = strs[0].charAt(i);
             
            //we then iterate through the strings after the string at index[0]
            for (int j = 1; j < strs.length; j ++) {
                //if i = length of another string in array
                //or if the char of this string is not equal to char in index[0] string
                if (i == strs[j].length() || strs[j].charAt(i) != c){
                    //return string at index[0] from first char to this point
                    return strs[0].substring(0, i);
                }
            }
        }
        // if string at index[0] is longest common prefix, return whole string
        return strs[0];
    }
}
