public class Solution 
{
    public void rotate(int[][] a) 
    {
        if(a == null || a.length == 0)
            return;
        
       int N = a.length;            
        
       for(int  i = 0; i < N/2; i++)
		{
			for(int j = 0; j < Math.ceil((double) N/2.); j++)
			{
				int temp = a[i][j];
				a[i][j] = a[N - j - 1][i];
				a[N - j - 1][i] = a[N - i - 1][N - j - 1];
				a[N - i - 1][N - j - 1] = a[j][N - i - 1];
				a[j][N - i - 1] = temp;
			}
		}
    }
}
