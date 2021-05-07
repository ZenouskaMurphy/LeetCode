/* COMPLETED
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:
Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1

Example 2:
Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
*/

public class NumberOfIslands {
    public int numIslands(char[][] grid) {        
        int numIslands = 0;
        
        for(int i=0; i<grid.length; i++){           // columns
            for(int j=0; j<grid[i].length; j++){    // rows 

                if(grid[i][j] == '1'){
                    dfs(grid, i, j); // call our dfs function 
                    numIslands++;
                }
            }
        }
        return numIslands;
    }
    
    public void dfs(char[][] grid, int i, int j){
        if(i < 0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j] == '0'){ //if out of bounds or char is 0
            return;
        }
        
        else{
            grid[i][j] = '0';  // change 1s to 0s to prevent visiting same char twice
            dfs(grid, i+1, j); // column upwards, same row
            dfs(grid, i-1, j); // colum downwards, same row
            dfs(grid, i, j-1); // same column, char to the left
            dfs(grid, i, j+1); // same columnm, char to the right
        }
    }
}
