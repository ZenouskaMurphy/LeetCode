/* COMPLETED
Given an m x n matrix. If an element is 0, set its entire row and column to 0. Do it in-place.

Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]


Follow up:
A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
*/


public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return;
        }
        
        boolean firstColumn = false;
        boolean firstRow = false;
        
        int row = matrix.length;
        int column = matrix[0].length;
        
        /*  Iterate through each row
            If there is a zero, we know that we must make this column all 0s
        */
        for(int i=0; i<row; i++){
            if(matrix[i][0] == 0){
                firstColumn = true;
                break;
            }
        }

        /*  Iterate through each column
            If there is a zero, we know that we must make this row
        */
        for(int j=0; j<column; j++){
            if(matrix[0][j] == 0){
                firstRow = true;
                break;
            }
        }
        
        /*  Iterate through whole matrix (excluding first row and column)
            If we come across a 0 cell, we mark the first cell of that row / first cell of that column as 0 
        */
        for(int k=1; k<row; k++){
            for(int l=1; l<column; l++){
               if(matrix[k][l] == 0){
                   matrix[0][l] = 0;
                   matrix[k][0] = 0;
               }
            }
        }
        /*  Iterate through whole matrix again (excluding first row and column)
            If first row or column cell was marked as 0, we make the whole row or column be 0
        */
        for(int k=1; k<row; k++){
            for(int l=1; l<column; l++){
               if(matrix[0][l] == 0 || matrix[k][0] == 0){
                   matrix[k][l] = 0;
               }
           }
        }
        
        /*  Now we alter the row of the column who's first cell was 0 to all be all 0s*/
        if(firstRow){
            for(int m=0; m<column; m++){
                matrix[0][m] = 0;
            }
        }
        /*  Now we alter the column of the row who's first cell was 0 to be all 0s*/
        if(firstColumn){
            for(int n=0; n<row; n++){
                matrix[n][0] = 0;
            }
        }
    }
}
