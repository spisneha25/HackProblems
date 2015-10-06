public class Solution 
{
    public int minPathSum(int[][] grid) 
    {
        if(grid == null || grid.length == 0)
            return 0;
            
        int m = grid.length;
        int n = grid[0].length;
        
        return minPathHelper1(grid, m, n);
        //return minPathHelper2(grid, 0, 0, 0, m, n);
    }
    
    //Dynamic Programming
    public int minPathHelper1(int[][] grid, int m, int n)
    {
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        
        for(int j = 1; j < n; j++)
        {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        
        for(int i = 1; i < m; i++)
        {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        
        
        for(int i = 1; i < m; i++)
        {
            for(int j = 1; j < n; j++)
            {
                if(dp[i-1][j] > dp[i][j - 1])
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                else
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
            }
        }
        
        return dp[m-1][n-1];
    }
    
    
    //Not efficient
    public int minPathHelper2(int[][] grid, int sum, int r, int c, int m, int n)
    {
        sum += grid[r][c];
        
        if(r == m-1 && c == n-1)
            return sum;
        
        if(r == m-1)
            return minPathHelper2(grid, sum, r, c + 1, m, n);
        if(c == n-1)
            return minPathHelper2(grid, sum, r + 1, c, m, n);
            
        return Math.min(minPathHelper2(grid, sum, r + 1, c, m, n), minPathHelper2(grid, sum, r, c + 1, m, n));
    }
}
