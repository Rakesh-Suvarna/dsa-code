package com.programs.noofislands;

public class Solution {

    public int numIslands(char[][] matrix) {

        //finds and stores the length of the matrix or grid      
        int h = matrix.length;  
        if (h == 0)  
            //if matrix has no elements, returns 0  
            return 0;  

        int l = matrix[0].length;  
        int result = 0;  
        for (int i = 0; i < h; i++)   
        {  
            for (int j = 0; j < l; j++)   
            {  
        
                if (matrix[i][j] == '1')   
                {  
                    //if the above condition returns true, calls the dfs() function and increments the result  
                    dfs(matrix, i,  j);  
                    result++;  
                }  
            }  
        }  
        return result;  
    }  
    //function performs the depth first search over the matrix  
    public void dfs(char[][] matrix, int row, int col)   
    {  
        int H = matrix.length;  
        int L = matrix[0].length;  
        //returns true if any of the condition returns true  
        if (row < 0 || col < 0 || row >= H || col >= L || matrix[row][col] != '1')  
            return;  
        //marking element as visited  
        matrix[row][col] = '0';   
        //moves in right direction  
        dfs(matrix, row+ 1, col);   
        //moves in left direction  
        dfs(matrix, row- 1, col);   
        //moves in downward direction  
        dfs(matrix, row, col + 1);   
        //moves in upward direction  
        dfs(matrix, row, col - 1);   
    } 
}