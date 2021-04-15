/* COMPLETED
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.
*/

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        //create hash map
        char [] c = new char[256];
        
        //split string s into chars to put into hashmap c
        //count occurences of each char 
        for(int i=0; i<s.length(); i++){
            c[s.charAt(i)]++;
        }
        
        // if occurence of char is already 1, print out char
        for(int i=0; i<s.length(); i++){
            if (c[s.charAt(i)] == 1){
                return i;
            }
        }
        return -1; // no duplicates
    }
}
