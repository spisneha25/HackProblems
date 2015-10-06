/*
n = 1: 1 1
n = 2: 2 11, 2
n = 3: 3 12, 21, 111
n = 4: 5 1111,211,22,121,112
:
:
Fibonacci Series
*/

public class Solution 
{
    public int climbStairs(int n) 
    {
        if(n <= 2)
            return n;
        
        int a = 1, b = 2, c;
        
        for(int i = 3; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        
        return b;
    }
}
