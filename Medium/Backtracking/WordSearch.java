/* COMPLETED
Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example 1
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true

Example 2
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true

*/

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        char [] letters = word.toCharArray(); // A B C C E D 
        
        for(int i=0; i<board.length; i++){          //row     
            for(int j=0; j<board[i].length; j++){   //column
                
                if(exists(board, i, j, letters, 0)){ // call to our dfs function
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean exists(char[][] board, int i, int j, char[]letters, int index){
        if (i<0 || j<0 || i == board.length || j == board[i].length){ //if we are out of bounds 
            return false;
        } 
        
        if (index == letters.length){ // if we have found the entire word
            return true;
        }
        
        if(board[i][j] != letters[index]){ // board coords are not letters in string 
            return false;
        }
        
        board[i][j] = 0; // mark board coords as visited before visiting
        
        boolean exists = exists(board, i, j+1, letters, index+1) ||       /*iterate through board*/
                         exists(board, i, j-1, letters, index+1) ||
                         exists(board, i+1, j, letters, index+1) ||
                         exists(board, i-1, j, letters, index+1);
        
        board[i][j] = letters[index]; //mark board coords as part of word after visiting
        
        return exists;
    } 
}
