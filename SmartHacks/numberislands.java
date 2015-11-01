public class Solution {
    public int numIslands(char[][] grid) 
    {
        if(grid == null || grid.length == 0)
            return 0;

        int count = 0;
        
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == '1')
                {
                    merge(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    private void merge(char[][] grid, int i, int j)
    {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return;
            
        if(grid[i][j] != '1')
            return;
            
        grid[i][j] = '0';
        
        merge(grid, i+1, j);
        merge(grid, i-1, j);
        merge(grid, i, j-1);
        merge(grid, i, j+1);
    }
}
