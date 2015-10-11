public class Solution 
{
    public double myPow(double x, int n) 
    {
        if(n == 0)
            return 1;
            
        else if(n < 0)
            return 1/power2(x, -n);
        
        else
            return power2(x, n);
    }
    
    //O(n)
    private double power1(double x, int n)
    {
        double mul = 1;
        for(int i = 0; i < n; i++)    
            mul *= x;
            
        return mul;
    }
    
    //O(logn)
    private double power2(double x, int n)
    {
        if(n == 0)
            return 1;
        
        double ans = power2(x, n/2);
        
        if(n%2 == 0)
            ans = ans * ans;
        else
            ans = ans * ans * x;
        
        return ans; 
    }
}
