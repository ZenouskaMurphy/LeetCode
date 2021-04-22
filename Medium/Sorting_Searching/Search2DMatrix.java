/* COMPLETED
Write an efficient algorithm that searches for a target value in an m x n integer matrix. The matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.

Example 1: 
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true

Example 2:
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false
*/

public class Search2DMatrix {
    /* Method 1 - Works but not most efficient*/
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    
    /*  Method 2 - works and is more efficient*/
    /*  we start on the first row and look at last element of this row
        if target > than this element , we need to look at next row for the target
        if target < last element, target cannot be in that column, therefore we can remove that column from search
    */
    public boolean searchMatrix2(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        
        int row = 0;
        int column = matrix[0].length -1;
        while(row < matrix.length && column >=0){
            if(matrix[row][column] == target){
                return true;
            }
            if(matrix[row][column] > target){
                column--;
            }
            else{
                row++;
            }
        }
        return false;  
    }   
}
