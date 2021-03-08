/* NOT COMPLETED
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
    public String longestCommonPrefix(String[] strs) {
        String split = "";
        char first = 'c';
        
        if(strs == null || strs.length == 0){
            return "";
        }
        
        for(int i=0; i<strs.length; i++){
            split = strs[i]; // 3 strings
            first = split.charAt(0); // first char of 3 strings
            for(int j=1; j<strs.length; j++){
                if(strs[j].charAt(i) != first){
                }
            }
        }
        
        return split;
    }
}
