public class Solution 
{
    public int uniquePaths(int m, int n) 
    {
        return pathCalc2(m, n);
    }
    
    private int pathCalc1(int m, int n, int i, int j)
    {
        if(m-1 == i && n-1 == j)
            return 1;
        
        else if(m-1 == i)
            return pathCalc1(m, n, i, j + 1);
        
        else if(n-1 == j)
            return pathCalc1(m, n, i + 1, j);
            
        else if(i < m && j < n)
            return pathCalc1(m, n, i, j + 1) + pathCalc1(m, n, i + 1, j);
        
        else 
            return 0;
    }
    
    //More time efficient 
    private int pathCalc2(int m, int n)
    {
        if(m == 0 || n == 0)
            return 0;
        if(m == 1 || n == 1)
            return 1;
            
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++)
            dp[i][0] = 1;
        
        for(int i = 0; i < n; i++)
            dp[0][i] = 1;
            
        for(int i = 1; i < m; i++)
        {
            for(int j = 1; j < n; j++)
            {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        return dp[m-1][n-1];
    }
}

